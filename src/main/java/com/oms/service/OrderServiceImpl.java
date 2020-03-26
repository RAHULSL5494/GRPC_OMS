package com.oms.service;

import java.util.Optional;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oms.model.Order;
import com.oms.repo.OrderRepository;
import com.oms.utility.OrderIdGenerator;
@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private OrderIdGenerator orderIdGenerator;
	
	private static final String STATUS_OPEN = "Open";

	private  static Logger log = Logger.getLogger(OrderServiceImpl.class.getName());



	@Override
	public int createOrder(Order order) {
		log.info("H2 DB call to create Order");
		order = orderIdGenerator.generateOrderID(order);
		order.setStatus(STATUS_OPEN);
		orderRepository.save(order);
		return order.getOrderID();
	}

}
