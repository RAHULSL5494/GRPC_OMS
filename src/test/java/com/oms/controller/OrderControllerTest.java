
package com.oms.controller;

import com.oms.model.Order;
import com.oms.service.OrderService;
import com.oms.validator.OmsValidator;
import org.junit.jupiter.api.Assertions;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.ResponseEntity;

@ExtendWith(MockitoExtension.class)
@RunWith(MockitoJUnitRunner.class)
public class OrderControllerTest {
	@InjectMocks
	private OrderController orderController ;
	@Mock
	private OrderService orderService ;
	@Mock
	private OmsValidator omsValidator;

	@Mock
	private com.oms.grpcClient.GrpcClient grpcClient ;
	
	private Order order;

	private com.oms.Order grpcOrder;
	
	private ResponseEntity<Object> getResponse; 
	
	private ResponseEntity<String> postResponse; 
	

	@Test
	public void testGET() {
		order =buildOrder();
		grpcOrder = build(order);
		int orderId =123;
		Mockito.when(omsValidator.validateOrderId(orderId)).thenReturn(true);
		Mockito.when(grpcClient.getOrder(orderId)).thenReturn(grpcOrder);
		getResponse = orderController.getOrder(orderId);
		Assertions.assertNotNull(getResponse);
		Assertions.assertNotNull(getResponse.getBody());
		Assertions.assertEquals(200,getResponse.getStatusCodeValue());
	}


	@Test
	public void testPOST() {
		order =buildOrder();
		Mockito.when(orderService.createOrder(order)).thenReturn(123); 
		postResponse = orderController.createOrder(order);
		Assertions.assertNotNull(postResponse);
		Assertions.assertNotNull(postResponse.getBody());
		Assertions.assertEquals(200,postResponse.getStatusCodeValue());
	}
	
	private Order buildOrder() {
		Order order = new Order();
		order.setOrderID(123);
		order.setDirection("E");
		order.setPrice(500);
		order.setQuantity(100);
		order.setStatus("Open");
		order.setTicker("AMZN");
		order.setType("online");

		return order;
	}
	private com.oms.Order build(Order order){
		com.oms.Order.Builder builder = com.oms.Order.newBuilder();
		builder.setDirection(order.getDirection());
		builder.setOrderId(order.getOrderID());
		builder.setPrice(order.getPrice());
		builder.setQuantity(order.getQuantity());
		builder.setStatus(order.getStatus());
		builder.setTicker(order.getTicker());
		builder.setType(order.getType());
		return builder.build();
	}
}

