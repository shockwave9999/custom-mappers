package com.home.roy;

import com.home.roy.entity.OrderEntity;
import com.home.roy.mapper.MapStructConverter;
import com.home.roy.mapper.ModelMapperConverter;
import com.home.roy.model.Address;
import com.home.roy.model.Order;
import com.home.roy.model.User;

public class TestMappers {
	
	public void testMapStruct(Order order) {
		OrderEntity newOrderEntity = MapStructConverter.INSTANCE.convert(order);
		System.out.println(newOrderEntity);
	}
	
	public static void main(String[] args) {
		Order order = getOrder();
		ModelMapperConverter converter = new ModelMapperConverter();
		OrderEntity orderEntity = converter.convert(order);
		System.out.println(orderEntity.toString());
		System.out.println(converter.convert(orderEntity));
	}	
	
	public static Order getOrder() {
		Order order = new Order();
		order.setOrderNumber("order1234");
		
		Address address = new Address();
		address.setCity("Bangalore");
		address.setStreet("Lavelle Road");
		order.setAddress(address);
		
		User user = new User();
		user.setName("Arindum");
		user.setAge(32);
		order.setUser(user);
		
		return order;
	}

}
