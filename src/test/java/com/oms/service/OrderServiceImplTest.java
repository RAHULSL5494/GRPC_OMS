
package com.oms.service;

import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.Assertions;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;

import com.oms.model.Order;
import com.oms.repo.OrderRepository;
import com.oms.utility.OrderIdGenerator;

@ExtendWith(MockitoExtension.class)
@RunWith(MockitoJUnitRunner.class)
public class OrderServiceImplTest {
	@InjectMocks
	private OrderServiceImpl orderServiceImpl;
	@Mock
	private OrderRepository orderRepository;
	@Mock
	private OrderIdGenerator orderIdGenerator;

	private Order order;



	@Test
	public void testCreateOrder() {
		order = buildOrder();
		when(orderIdGenerator.generateOrderID(order)).thenReturn(order);
		when(orderRepository.save(order)).thenReturn(order);
		Assertions.assertEquals(123, orderServiceImpl.createOrder(order));

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
}

