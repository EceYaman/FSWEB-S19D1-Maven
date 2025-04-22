package com.workintech.s18d2.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalErrorHandler {
    @ExceptionHandler
    public ResponseEntity<PlantErrorResponse> handleException(PlantException exception){
        PlantErrorResponse response = new PlantErrorResponse(exception.getMessage());
        return new ResponseEntity<>(response, exception.getHttpStatus());
    }
    @ExceptionHandler
    public ResponseEntity<PlantErrorResponse> handleException(Exception exception){
        PlantErrorResponse response = new PlantErrorResponse(exception.getMessage());
        return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
