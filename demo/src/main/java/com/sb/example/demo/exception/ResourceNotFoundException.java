package com.sb.example.demo.exception;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends Exception {
    private static final long serialVersionUID = 1;

    public ResourceNotFoundException(String message){
        super(message);
    }
}