package com.home.roy.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.home.roy.entity.OrderEntity;
import com.home.roy.model.Order;

@Mapper(componentModel = "cdi")
public interface MapStructConverter {
	
	MapStructConverter INSTANCE = Mappers.getMapper(MapStructConverter.class);

	OrderEntity convert(Order order);
	
	Order convert(OrderEntity orderEntity);
}
