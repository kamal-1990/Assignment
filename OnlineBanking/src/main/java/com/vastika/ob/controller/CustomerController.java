package com.vastika.ob.controller;


import javax.swing.JOptionPane;

import com.vastika.ob.model.Customer;

import com.vastika.ob.service.CustomerService;
import com.vastika.ob.service.CustomerServiceImpl;

public class CustomerController {
	public static void main(String[] args) {
		CustomerService customerService=new CustomerServiceImpl();
		
		String choice=JOptionPane.showInputDialog("enter choice: create|balance|detail");
		
		switch (choice) {
		case "create":
			
			
		Customer customer=getCustomer();
		int created=customerService.createAccount(customer);
		
		
		if (created>=1) {
			JOptionPane.showMessageDialog(null, "account info inserted succesfully.");
			
		} else {
			JOptionPane.showMessageDialog(null,"something went wrong.");
		}
			break;
		case "detail":
			
			
			Customer cust=getCust();
			int detailed=customerService.acountDetail(cust);
			
			
			if (detailed>=1) {
				JOptionPane.showMessageDialog(null,"transaction info inserted succesfully.");
				
			} else {
				JOptionPane.showMessageDialog(null,"something went wrong.");
			}
				break;
		case"balance":
			long account_no=Integer.parseInt(JOptionPane.showInputDialog("enter account_no: "));
			Customer c=customerService.checkBalance(account_no);
			System.out.println(" id: " + c.getId());
			System.out.println("account name is: "+c.getAccount_name());
			System.out.println("account number is: "+c.getAccount_no());
			System.out.println(" initial amount: "+c.getInitial_balance());
			System.out.println(" deposited amount: "+c.getDeposited_amount());
			System.out.println("withdrew amount is: "+c.getWithdrew_amount());
			
			
			
			break;

		default:
			JOptionPane.showMessageDialog(null,"went wrong.");
			
			
			break;
		}

		}
		
		public static Customer getCustomer() {
			
		
		Customer customer = new Customer();
		String account_name = JOptionPane.showInputDialog("enter account holder name: ");
        long account_no=Long.parseLong(JOptionPane.showInputDialog("enter account number: "));
        String email=JOptionPane.showInputDialog("enter email address: ");
        long mobileNo=Long.parseLong(JOptionPane.showInputDialog("enter mobile number: "));
        boolean status=Boolean.parseBoolean(JOptionPane.showInputDialog("enter status of customer: "));
        
        
		
        customer.setAccount_name(account_name);
		customer.setAccount_no(account_no);
		customer.setEmail(email);
	    customer.setMobileNo(mobileNo);
		customer.setStatus(status);
		return customer;
		
		}
		public static Customer getCust() {
			Customer cust=new Customer();
			
			
			
	        long initial_balance=Long.parseLong(JOptionPane.showInputDialog("enter initial amount is: "));
	        long deposited_amount=Long.parseLong(JOptionPane.showInputDialog("enter deposited amount is: "));
	        
	        long withdrew_amount=Long.parseLong(JOptionPane.showInputDialog("enter withdrew amount is: "));
	        
	        
	        
			
	        
			cust.setInitial_balance(initial_balance);
			cust.setDeposited_amount(deposited_amount);
			
			cust.setWithdrew_amount(withdrew_amount);
			
			return cust;
			}
		

	}



