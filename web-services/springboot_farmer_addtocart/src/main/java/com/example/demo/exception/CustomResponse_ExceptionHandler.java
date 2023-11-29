package com.example.demo.exception;


import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


@ControllerAdvice("com.gavi.supermarket")
@RestController
public class CustomResponse_ExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(DataNotFound_Exception.class)
    public final ResponseEntity<Object> handleAllException(DataNotFound_Exception ex, WebRequest request) {
        Exception_Response exceptionResponse =  new Exception_Response(new Date(), ex.getMessage(), request.getDescription(false));

        return new ResponseEntity<Object>(exceptionResponse, HttpStatus.NOT_FOUND);
    };

    @ExceptionHandler(DuplicateElement_Exception.class)
    public final ResponseEntity<Object> handleDuplicateEntryException(DuplicateElement_Exception ex, WebRequest request) {
        Exception_Response exceptionResponse =  new Exception_Response(new Date(), ex.getMessage(), request.getDescription(false));

        return new ResponseEntity<Object>(exceptionResponse, HttpStatus.CONFLICT);
    };

    @ExceptionHandler(Exception.class)
    public final ResponseEntity<Object> handleOtherException(Exception ex, WebRequest request) {
        System.out.println(ex);
        Exception_Response exceptionResponse =  new Exception_Response(new Date(), ex.getMessage(), request.getDescription(false));

        return new ResponseEntity<Object>(exceptionResponse, HttpStatus.NOT_FOUND);
    };
}