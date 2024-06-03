package com.example.microservice.userDetailsService.Exception;

public class resourceNotFoundException extends RuntimeException{
    public resourceNotFoundException(){
        super("Resource Not Found Exception!!");
    }
    public resourceNotFoundException(String message){
        super(message);
    }
}
