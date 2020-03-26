package com.oms.validator;

import org.springframework.stereotype.Component;

@Component
public class OmsValidator {

	public Boolean validateOrderId(int orderId) {

		if (String.valueOf(orderId).length() > 3) {

			return false;
		}
		return true;
	}
}
