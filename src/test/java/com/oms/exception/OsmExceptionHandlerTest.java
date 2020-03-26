package com.oms.exception;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;

public class OsmExceptionHandlerTest {

	private OsmExceptionHandler osmExceptionHandler;

	private ResponseEntity<Object> response;

	@Test
	public void testHandleMethodArgumentNotValidException() {
		osmExceptionHandler = new OsmExceptionHandler();
		response = osmExceptionHandler
				.handleMethodArgumentNotValidException(new MethodArgumentNotValidException(null, null));
		Assertions.assertNotNull(response);
		Assertions.assertEquals("MethodArgumentNotValidException : Invalid input", response.getBody().toString());
		Assertions.assertEquals(400, response.getStatusCodeValue());

	}

	@Test
	public void testHandleOsmException() {
		osmExceptionHandler = new OsmExceptionHandler();
		OmsException osmException = new OmsException();
		response = osmExceptionHandler.handleOmsException(osmException);
		Assertions.assertNotNull(response);
		Assertions.assertEquals("OmsException :Invalid OrderId", response.getBody().toString());
		Assertions.assertEquals(400, response.getStatusCodeValue());

	}
}
