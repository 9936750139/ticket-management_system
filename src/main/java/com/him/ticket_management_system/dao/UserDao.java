package com.him.ticket_management_system.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.him.ticket_management_system.entity.User;



public class UserDao {

	private Connection con;
	private Statement st;
	
	
	public Connection getConnect()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ticket_manage", "root", "Himanshu@123");
		}
		catch(Exception e)
		{
			System.err.println(e);
		}
		return con;
	}
	
	public int insertUser(int uid, String uname, int uage, String ugender, String unationality, String umobile, String ufrom,String uto)
	{
		int n = 0;
		String sql = "insert into user values("+uid+",'"+uname+"',"+uage+",'"+ugender+"','"+unationality+"','"+umobile+"','"+ufrom+"','"+uto+"')";
		
		try {
			con = getConnect();
			st = con.createStatement();
			n = st.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return n;
	}
	
	public int updateUser(int uid, String uname, int uage, String ugender, String unationality, String umobile, String ufrom,String uto)
	{
		int n = 0;
		String sql = "update user set uname='"+uname+"',uage="+uage+",ugender='"+ugender+"',unationality='"+unationality+"',umobile='"+umobile+"',ufrom='"+ufrom+"',uto='"+uto+"' where uid ="+uid;		
		System.out.println(sql);
		try {
			con = getConnect();
			st = con.createStatement();
			n = st.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return n;
	}
	
	public int deleteUser(int uid)
	{
		int n = 0;
		String sql = "delete from user where uid="+uid;
		System.out.println(sql);
		try {
			con = getConnect();
			st = con.createStatement();
			n = st.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return n;
	}
	
	public User viewUser(int uid)
	{
		try {
			con = getConnect();
			ResultSet rs = null;
			st = con.createStatement();
			String sql = "select * from user where uid = "+uid;
			rs = st.executeQuery(sql);
			if(rs.next())
			{
				return new User(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
		
	}
	
	public ArrayList<User> viewUsers()
	{
		ArrayList<User> al = new ArrayList<User>();
		try {
			con = getConnect();
			ResultSet rs = null;
			st = con.createStatement();
			String sql = "select * from user";
			rs = st.executeQuery(sql);
			while(rs.next())
			{
				al.add(new User(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8)));
			}
			return al;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
		
	}

	

