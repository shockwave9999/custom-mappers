package com.home.roy.model;

public class Order {
	
	String orderNumber;
	
	Address address;
	
	User user;

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Order [orderNumber=" + orderNumber + ", address=" + address + ", user=" + user + "]";
	}

	
}
