package com.oms.controller;

import java.util.logging.Logger;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.oms.exception.OmsException;
import com.oms.model.Order;
import com.oms.service.OrderService;
import com.oms.validator.OmsValidator;

@RestController
public class OrderController {

	@Autowired
	private OrderService orderService;

	@Autowired
	private OmsValidator omsValidator;

	@Autowired
	private com.oms.grpcClient.GrpcClient grpcClient ;

	private static Logger log = Logger.getLogger(OrderController.class.getName());

	@GetMapping("/get-order/{orderId}")
	public ResponseEntity<Object> getOrder(@PathVariable Integer orderId) {
		log.info("Order GET call processing for orderId : " + orderId);

		if (omsValidator.validateOrderId(orderId)) {
			com.oms.Order order = grpcClient.getOrder(orderId);

			return new ResponseEntity<>(build(order), HttpStatus.OK);
		} else
			log.info("OmsException - Invalid orderId");
		throw new OmsException();
	}

	@PostMapping("/create-order")
	public ResponseEntity<String> createOrder(@Valid @RequestBody Order order) {
		int orderId = orderService.createOrder(order);
		return new ResponseEntity<>("Order placed successfully,your OrderID is " + orderId, HttpStatus.OK);
	}

	private Order build(com.oms.Order grpcOrder){
		Order order = new Order();
		order.setDirection(grpcOrder.getDirection());
		order.setTicker(grpcOrder.getTicker());
		order.setOrderID(grpcOrder.getOrderId());
		order.setPrice(grpcOrder.getPrice());
		order.setQuantity(grpcOrder.getQuantity());
		order.setStatus(grpcOrder.getStatus());
		order.setType(grpcOrder.getType());
		return order;

	}

}
