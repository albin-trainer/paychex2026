package com.example.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.exceptions.ApplicationException;

@RestControllerAdvice 
public class GlobalExceptionHandler {

    @ExceptionHandler (ApplicationException.class)
    public  ResponseEntity<String> handleApplicationException(Exception e){
        System.out.println("Handled ....");
        return   new ResponseEntity<String>(e.getMessage(),HttpStatus.NOT_FOUND);
       // return   new ResponseEntity<String>(e.getMessage(),HttpStatusCode.valueOf(9000));
    }
}
