package com.vastika.uis.controller;

import java.util.List;

import javax.swing.JOptionPane;

import com.vastika.uis.model.User;
import com.vastika.uis.service.UserService;
import com.vastika.uis.service.UserServiceImpl;

public class UserController {
	public static void main(String[] args) {
		UserService userService = new UserServiceImpl();
		String decision=" ";

		do {
			
		
		String choice = JOptionPane.showInputDialog("enter choice: save|update|delete|list|get");
		switch (choice) {
		case "save":
			User user = getUser();

			int saved = userService.saveUserInfo(user);
			if (saved >= 1) {
				JOptionPane.showMessageDialog(null, "user info is saved successfully in database.");
			} else {
				JOptionPane.showMessageDialog(null, "saving error in db.");

			}

			break;
		case "update":
			User updatedUser = getUser();
			int id = Integer.parseInt(JOptionPane.showInputDialog("enter id to update: "));
			updatedUser.setId(id);

			int updated = userService.updateUserInfo(updatedUser);
			if (updated >= 1) {
				JOptionPane.showMessageDialog(null, "user info is updated successfully in database.");
			} else {
				JOptionPane.showMessageDialog(null, "updating error in db.");

			}

			break;
		case "delete":

			id = Integer.parseInt(JOptionPane.showInputDialog("enter id to delete: "));

			int deleted = userService.deleteUserinfo(id);
			if (deleted >= 1) {
				JOptionPane.showMessageDialog(null, "user info is deleted successfully in database.");
			} else {
				JOptionPane.showMessageDialog(null, "updating error in db.");

			}

			break;
		case "list":
			List<User> userList = userService.getAllUserInfo();
			for (User u : userList) {
				System.out.println("enter id: " + u.getId());
				System.out.println("enter username: " + u.getUsername());
				System.out.println("enter password: " + u.getPassword());
				System.out.println("enter mobilenumber: " + u.getMobileNo());
				System.out.println("enter salary: " + u.getSalary());
				System.out.println("enter status: " + u.isActive());
				System.out.println("=============================");
			}

			break;
		case "get":
			id = Integer.parseInt(JOptionPane.showInputDialog("enter id to delete: "));
			User u = userService.getUserById(id);
			
				System.out.println("enter id: " + u.getId());
				System.out.println("enter username: " + u.getUsername());
				System.out.println("enter password: " + u.getPassword());
				System.out.println("enter mobilenumber: " + u.getMobileNo());
				System.out.println("enter salary: " + u.getSalary());
				System.out.println("enter status: " + u.isActive());
				System.out.println("=============================");
			

			break;

		default:
			JOptionPane.showMessageDialog(null, "wrong choice");
			break;
		
		}
		decision=JOptionPane.showInputDialog("Do you want to continue-yes or no?");
		} while (decision.equalsIgnoreCase("yes"));
		JOptionPane.showMessageDialog(null, "go and check database!!!");
	}

	public static User getUser() {
		User user = new User();
		String username = JOptionPane.showInputDialog("Enter name: ");
		String password = JOptionPane.showInputDialog("Enter password: ");
		long mobileNo = Long.parseLong(JOptionPane.showInputDialog("Enter mobile number: "));
		double salary = Double.parseDouble(JOptionPane.showInputDialog("Enter the salary: "));
		boolean isActive = Boolean.parseBoolean(JOptionPane.showInputDialog("Is user active?"));
		user.setUsername(username);
		user.setPassword(password);
		user.setMobileNo(mobileNo);
		user.setSalary(salary);
		user.setActive(isActive);
		return user;

	}
}
