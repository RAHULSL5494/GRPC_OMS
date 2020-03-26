package com.oms.utility;

import java.util.Random;
import java.util.logging.Logger;

import org.springframework.stereotype.Component;

import com.oms.model.Order;

@Component
public class OrderIdGenerator {

	private static Logger log = Logger.getLogger(OrderIdGenerator.class.getName());

	public Order generateOrderID(Order order) {

		log.info("OrderId generator");
		Random rand = new Random();

		order.setOrderID(rand.nextInt(1000));	
		return order;
	}

}
