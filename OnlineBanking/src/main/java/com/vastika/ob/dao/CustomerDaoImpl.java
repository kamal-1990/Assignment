package com.vastika.ob.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.vastika.ob.model.Customer;

import com.vastika.ob.util.DButil;

public class CustomerDaoImpl implements CustomerDao {
	public static final String CREATE_SQL = "insert into account_tbl(account_name,account_no,mobileNo,email,status)values(?,?,?,?,?)";
	public static final String TRANSACTION_SQL="insert into transaction_tbl(initial_balance,deposited_amount,withdrew_amount)values(?,?,?)";
	public static final String BALANCE_BY_ID_SQL = "select account_tbl.account_name,transaction_tbl.initial_balance,transaction_tbl.deposited_amount,transaction_tbl.withdrew_amount from account_tbl,transaction_tbl where account_tbl.account_no=transaction_tbl.account_no and account_tbl.account_no=?";

	public int createAccount(Customer customer) {
		int created = 0;
		try (PreparedStatement ps = DButil.getConnection().prepareStatement(CREATE_SQL);) {

			ps.setString(1, customer.getAccount_name());

			ps.setLong(2, customer.getAccount_no());
			ps.setLong(3, customer.getMobileNo());

			ps.setString(4, customer.getEmail());
			ps.setBoolean(5, customer.isStatus());
			created = ps.executeUpdate();

		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}
		return created;

	}
	@Override
	public int acountDetail(Customer cust) {
		int detailed=0;
		try (PreparedStatement ps = DButil.getConnection().prepareStatement(TRANSACTION_SQL);){
            ps.setLong(1, cust.getInitial_balance());
            ps.setLong(2, cust.getDeposited_amount());
            
            ps.setLong(3, cust.getWithdrew_amount());
            detailed=ps.executeUpdate();
            
		} catch (ClassNotFoundException | SQLException e) {
		
			e.printStackTrace();
		}
		
		return detailed;
	}
	

	public Customer checkBalance(long account_no) {
		Customer c = new Customer();
		try (PreparedStatement ps = DButil.getConnection().prepareStatement(BALANCE_BY_ID_SQL);) {
			ps.setLong(1, c.getAccount_no());
			
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				c.setId(rs.getInt("id"));
				c.setAccount_name(rs.getString("account_name"));
				c.setAccount_no(rs.getLong("account_no"));
				c.setInitial_balance(rs.getLong("initial_amount"));
				c.setDeposited_amount(rs.getLong("deposited_amount"));
				c.setWithdrew_amount(rs.getLong("withdrew_amount"));
				
				
			}

		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}

		return c;
	}


	

}
