package com.home.roy.mapper;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.modelmapper.spi.PropertyInfo;

import com.home.roy.entity.OrderEntity;
import com.home.roy.model.Order;

public class ModelMapperConverter {
	
	private ModelMapper modelMapper;
	 
    public ModelMapperConverter() {
        modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
       /* List<PropertyInfo> result =  modelMapper.createTypeMap(Order.class, OrderEntity.class).getUnmappedProperties();
        for (PropertyInfo propertyInfo : result) {
        	System.out.println(propertyInfo.toString());
		}*/
    }
 
    public OrderEntity convert(Order sourceOrder) {
       return modelMapper.map(sourceOrder, OrderEntity.class);
    }
 
    public Order convert(OrderEntity sourceCode) {
        return modelMapper.map(sourceCode, Order.class);
    }
}
