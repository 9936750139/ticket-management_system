package com.him.ticket_management_system.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.him.ticket_management_system.dao.UserDao;
import com.him.ticket_management_system.entity.User;



public class UserService {

	private UserDao uDao = new UserDao();
	Scanner ip = new Scanner(System.in);
	
	//Create user
	
	public boolean createUser(int count)
	{
		while(count > 0)
		{
			System.out.println("Enter the user details:");
			System.out.println("Enter the uid:");
			int uid = ip.nextInt();
			System.out.println("Enter the uName:");
			String uname = ip.nextLine();
			ip.nextLine();
			System.out.println("Enter the uage:");
			int uage = ip.nextInt();
			System.out.println("Enter the ugender:");
			String ugender= ip.next();
			System.out.println("Enter the unationality:");
			String unationality= ip.next();
			System.out.println("Enter the umobile:");
			String umobile = ip.next();
			System.out.println("Enter the ufrom:");
			String ufrom= ip.next();
			System.out.println("Enter the uto:");
			String uto= ip.next();
			
			uDao.insertUser(uid, uname, uage, ugender, unationality,umobile,ufrom,uto);
			count--;
		}
		return true;
	}
	
	// Update User
	
	public boolean updateUser(int uid)
	{
		System.out.println("Enter the uName:");
		String uname = ip.nextLine();
		System.out.println("Enter the uage:");
		int uage = ip.nextInt();
		System.out.println("Enter the ugender:");
		String ugender= ip.next();
		System.out.println("Enter the unationality:");
		String unationality= ip.next();
		System.out.println("Enter the umobile:");
		String umobile = ip.next();
		System.out.println("Enter the ufrom:");
		String ufrom= ip.next();
		System.out.println("Enter the uto:");
		String uto= ip.next();
		
		uDao.updateUser(uid,uname, uage, ugender, unationality,umobile,ufrom,uto );
		return true;
	}
	
	 //Delete user
	
	public boolean deleteUser(int uid)
	{
		uDao.deleteUser(uid);
		return true;
	}
	
	 //view User
	
	public User viewUser(int uid)
	{
		return uDao.viewUser(uid);
	}
	
	//View Users
	
	public ArrayList<User> viewUsers()
	{
		return uDao.viewUsers();
	}
}
