package com.oms.model;

import javax.persistence.Entity;
/*import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;*/
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "order_table")
public class Order {
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private int orderId;
	@NotBlank(message = "Order Type is mandatory")
	private String type;
	private String status;
	private int quantity;
	private int price;
	@NotBlank(message = "Order Ticker is mandatory")
	private String ticker;
	@NotBlank(message = "Order Direction is mandatory")
	private String direction;

	public int getOrderID() {
		return orderId;
	}

	public void setOrderID(int orderID) {
		this.orderId = orderID;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getTicker() {
		return ticker;
	}

	public void setTicker(String ticker) {
		this.ticker = ticker;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

}
