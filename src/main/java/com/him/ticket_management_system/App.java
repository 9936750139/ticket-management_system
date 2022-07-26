package com.him.ticket_management_system;

import java.util.Scanner;

import com.him.ticket_management_system.entity.User;
import com.him.ticket_management_system.service.UserService;

public class App {
 public static void main(String[] arg) {
	 UserService us =new UserService();
	 int uid;
	 char ch ='y';
	 while( ch=='y'||ch=='Y')
	 {
		 System.out.println("******TICKET MANAGEMENT SYSTEM ********");
		
		 System.out.println("1)Add User\n2)View User\n3)View Users\n4)Update User\n5)Delete User");
			Scanner ip = new Scanner(System.in);
			System.out.println("Enter your choice: ");
			int option = ip.nextInt();
			switch(option)
			{
				case 1:
					System.out.println("Enter the number of Users:");
					int count = ip.nextInt();
					us.createUser(count);
					break;
				case 2:
					System.out.println("Enter the id of User:");
					uid = ip.nextInt();
					System.out.println(us.viewUser(uid));
					break;
				case 3:
					for(User u:us.viewUsers())
					{
						System.out.println(u);
					}
					break;
				case 4:
					System.out.println("Enter the id of User:");
					uid = ip.nextInt();
					us.updateUser(uid);
					break;
				case 5:
					System.out.println("Enter the id of User:");
					uid = ip.nextInt();
					us.deleteUser(uid);
					break;
				default:
					System.out.println("Invalid Choice..");
					break;
			}
			System.out.println("Enter Y to continue...");
			ch = ip.next().charAt(0);
			}
			System.out.println("Thankyou for using...");
		
 }
}
