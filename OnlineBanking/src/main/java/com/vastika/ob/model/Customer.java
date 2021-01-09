package com.vastika.ob.model;



public class Customer {
	private int id;
	private String account_name;
	private long account_no;
	private long mobileNo;
	private String email;
	private boolean status;
	private long initial_balance;
	private long deposited_amount;
	
	private long withdrew_amount;
	
	
	
	public long getInitial_balance() {
		return initial_balance;
	}
	public void setInitial_balance(long initial_balance) {
		this.initial_balance = initial_balance;
	}
	public long getDeposited_amount() {
		
		return deposited_amount;
	}
	public void setDeposited_amount(long deposited_amount) {
		this.deposited_amount = deposited_amount;
	}
	
	
	public long getWithdrew_amount() {
		
		return withdrew_amount;
	}
	public void setWithdrew_amount(long withdrew_amount) {
		this.withdrew_amount = withdrew_amount;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAccount_name() {
		return account_name;
	}
	public void setAccount_name(String account_name) {
		this.account_name = account_name;
	}
	public long getAccount_no() {
		return account_no;
	}
	public void setAccount_no(long account_no) {
		this.account_no = account_no;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	

}
