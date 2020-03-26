package com.oms.validator;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class OmsValidatorTest {

	private OmsValidator omsValidator;

	@Test
	public void test() {
		omsValidator = new OmsValidator();
		assertTrue(omsValidator.validateOrderId(123));
		assertFalse(omsValidator.validateOrderId(1236));

	}

}
