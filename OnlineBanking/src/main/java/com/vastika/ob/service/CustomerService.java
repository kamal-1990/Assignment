package com.vastika.ob.service;

import com.vastika.ob.model.Customer;


public interface CustomerService {
	public int createAccount(Customer customer);
	public int acountDetail(Customer cust);
	Customer checkBalance(long account_no);
	

}
