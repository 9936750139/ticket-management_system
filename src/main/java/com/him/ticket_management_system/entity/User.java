package com.him.ticket_management_system.entity;

public class User {
 private int uid;
 private String uname;
 private int uage;
 private String ugender;
 private String unationality;
 private String umobile;
 private String ufrom;
 private String uto;
public User() {
	super();
	// TODO Auto-generated constructor stub
}
public User(int uid, String uname, int uage, String ugender, String unationality, String umobile, String ufrom,
		String uto) {
	super();
	this.uid = uid;
	this.uname = uname;
	this.uage = uage;
	this.ugender = ugender;
	this.unationality = unationality;
	this.umobile = umobile;
	this.ufrom = ufrom;
	this.uto = uto;
}
public int getUid() {
	return uid;
}
public void setUid(int uid) {
	this.uid = uid;
}
public String getUname() {
	return uname;
}
public void setUname(String uname) {
	this.uname = uname;
}
public int getUage() {
	return uage;
}
public void setUage(int uage) {
	this.uage = uage;
}
public String getUgender() {
	return ugender;
}
public void setUgender(String ugender) {
	this.ugender = ugender;
}
public String getUnationality() {
	return unationality;
}
public void setUnationality(String unationality) {
	this.unationality = unationality;
}
public String getUmobile() {
	return umobile;
}
public void setUmobile(String umobile) {
	this.umobile = umobile;
}
public String getUfrom() {
	return ufrom;
}
public void setUfrom(String ufrom) {
	this.ufrom = ufrom;
}
public String getUto() {
	return uto;
}
public void setUto(String uto) {
	this.uto = uto;
}
@Override
public String toString() {
	return "User [uid=" + uid + ", uname=" + uname + ", uage=" + uage + ", ugender=" + ugender + ", unationality="
			+ unationality + ", umobile=" + umobile + ", ufrom=" + ufrom + ", uto=" + uto + "]";
}
 
}
