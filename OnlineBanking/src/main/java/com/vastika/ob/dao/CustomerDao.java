package com.vastika.ob.dao;

import com.vastika.ob.model.Customer;


public interface CustomerDao {
	public int createAccount(Customer customer);
	public int acountDetail(Customer cust);
	Customer checkBalance(long account_no);
	

	
	

}
