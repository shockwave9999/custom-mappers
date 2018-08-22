package com.home.roy.entity;

public class OrderEntity {
	
	String orderNumber;
	
	String name;
	
	Integer age;
	
	String street;
	
	String city;

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "OrderEntity [orderNumber=" + orderNumber + ", name=" + name + ", age=" + age + ", street=" + street
				+ ", city=" + city + "]";
	}
	
	
}
