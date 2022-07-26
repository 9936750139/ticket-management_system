package com.him.ticket_management_system.dao;

import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;

import org.junit.Test;

import com.him.ticket_management_system.service.UserService;

import junit.framework.Assert;




public class TicketDAOTest {
	UserService usvc = new UserService();
	UserDao udao = new UserDao();
	@Test
	public void testGetConnect() {
		Assert.assertNotNull(udao.getConnect());
	}
	
	@Test(expected=SQLIntegrityConstraintViolationException.class)
	public void testInsertUser() throws SQLException {
		udao.insertUser(105,"Akshay",18,"male","India","9936750133","Varanasi","Lucknow");
	}

	

	@Test
	public void testUpdateUser() {
		Assert.assertEquals(1,udao.updateUser(105,"Akshay",18,"male","India","9936750133","Varanasi","Lucknow"));
	}

	
	
	

	@Test
	public void testDeleteUser() {
		Assert.assertEquals(1, udao.deleteUser(105));
	}

	
	@Test
	public void testViewUser() {
		Assert.assertNotNull(udao.viewUser(101));
	}

	

	@Test
	public void testViewUsers() {
		Assert.assertNotNull(udao.viewUser(101));
	}

}
