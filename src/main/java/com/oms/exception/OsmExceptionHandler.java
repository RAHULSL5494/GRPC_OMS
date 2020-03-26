package com.oms.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class OsmExceptionHandler {

	 @ExceptionHandler(value = {MethodArgumentNotValidException.class})
	 public ResponseEntity<Object> handleMethodArgumentNotValidException(MethodArgumentNotValidException ex) {
		 return new ResponseEntity<>("MethodArgumentNotValidException : Invalid input", HttpStatus.BAD_REQUEST);
	 
	  
	 }
	 @ExceptionHandler(value = {OmsException.class})
	 public ResponseEntity<Object> handleOmsException(OmsException ex) {
		 return new ResponseEntity<>("OmsException :Invalid OrderId", HttpStatus.BAD_REQUEST);
	 
	  
	 }
	 
}
