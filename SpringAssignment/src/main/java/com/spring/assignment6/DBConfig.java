package com.spring.assignment6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("dbconfig")
public class DBConfig {
	@Autowired
	@Value("${db.driverClassName}")
private String dbDriverClass;
	@Value("${db.url}")
private String dbUrl;
	@Value("${db.username}")
private String sbUser;
	@Value("${db.password}")
private String dbPwd;


public DBConfig(String dbDriverClass, String dbUrl, String sbUser, String dbPwd) {
	super();
	this.dbDriverClass = dbDriverClass;
	this.dbUrl = dbUrl;
	this.sbUser = sbUser;
	this.dbPwd = dbPwd;
}

public DBConfig() {
	super();
}

public String getDbDriverClass() {
	return dbDriverClass;
}
public void setDbDriverClass(String dbDriverClass) {
	this.dbDriverClass = dbDriverClass;
}
public String getDbUrl() {
	return dbUrl;
}
public void setDbUrl(String dbUrl) {
	this.dbUrl = dbUrl;
}
public String getSbUser() {
	return sbUser;
}
public void setSbUser(String sbUser) {
	this.sbUser = sbUser;
}
public String getDbPwd() {
	return dbPwd;
}
public void setDbPwd(String dbPwd) {
	this.dbPwd = dbPwd;
}

void printDB() {
	System.out.println("DriverClass :"+ dbDriverClass);
	System.out.println("url :"+ dbUrl);
	System.out.println("UserName :"+ sbUser);
	System.out.println("passward :"+ dbPwd);
	
	
}
}
