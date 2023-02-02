package com.enigma.grooming.exception;

public class NotFoundException extends RuntimeException {
    public NotFoundException() {
        super("Data is not found");
    }

    public NotFoundException(String message) {
        super(message);
    }
}