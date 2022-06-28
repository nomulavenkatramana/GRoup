package com.spring.assignments;

public class Customers {

private int customerId;
private String customerName;
private String customerContact;
private Address Address;
public Customers(int customerId, String customerName, String customerContact, Address address) {
	super();
	this.customerId = customerId;
	this.customerName = customerName;
	this.customerContact = customerContact;
	this.Address = address;
}
public Customers() {
	super();
}
public int getCustomerId() {
	return customerId;
}
public void setCustomerId(int customerId) {
	this.customerId = customerId;
}
public String getCustomerName() {
	return getCustomerName();
}
public void setCustimerName(String customerName) {
	this.customerName = customerName;
}
public String getCustomerContact() {
	return customerContact;
}
public void setCustomerContact(String customerContact) {
	this.customerContact = customerContact;
}


public Address getAddress() {
	return Address;
}
public void setAddress(Address address) {
	Address = address;
}
public void printCustomersDetail(){
	System.out.println("Customer id \t\t: " +customerId );
    System.out.println("Customer Name \t\t: " + customerName);
    System.out.println("Customer Contact \t\t: " + customerContact);
    System.out.println("Customer Address"); 
    Address.printAddressDetail();
   
}

}
