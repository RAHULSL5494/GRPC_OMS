package com.oms.utility;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import com.oms.model.Order;

public class OrderIdGeneratorTest {

	private OrderIdGenerator orderIdGenerator;

	Order order;

	@Test
	public void test() {
		orderIdGenerator = new OrderIdGenerator();
		order = orderIdGenerator.generateOrderID(new Order());
		assertNotNull(order);
		assertNotNull(order.getOrderID());

	}

}
