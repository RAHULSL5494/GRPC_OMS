package com.oms.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class OrderTest {

	private Order order;

	@Test
	public void testOrder() {
		order = buildOrder();
		assertNotNull(order);
		assertEquals("E", order.getDirection());
		assertEquals(123, order.getOrderID());
		assertEquals(100, order.getQuantity());
		assertEquals("Open", order.getStatus());
		assertEquals("AMZN", order.getTicker());
		assertEquals("online", order.getType());

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
