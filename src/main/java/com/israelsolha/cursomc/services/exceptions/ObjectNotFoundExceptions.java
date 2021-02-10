package com.israelsolha.cursomc.services.exceptions;

public class ObjectNotFoundExceptions extends RuntimeException {

    public ObjectNotFoundExceptions(String message) {
        super(message);
    }

    public ObjectNotFoundExceptions(String message, Throwable cause) {
        super(message, cause);
    }
}
