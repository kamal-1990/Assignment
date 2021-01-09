package com.vastika.ob.service;

import com.vastika.ob.dao.CustomerDao;
import com.vastika.ob.dao.CustomerDaoImpl;
import com.vastika.ob.model.Customer;


public class CustomerServiceImpl implements CustomerService{
	CustomerDao customerDao=new CustomerDaoImpl();

	@Override
	public int createAccount(Customer customer) {
		return customerDao.createAccount(customer);
	}
	@Override
	public int acountDetail(Customer cust) {
		
		return customerDao.acountDetail(cust);
	}

	@Override
	public Customer checkBalance(long account_no) {
		
		return customerDao.checkBalance(account_no);
	}
	

	
	

	

}
