package com.example.simpleapplication.util.exception;

import java.util.Map;

public class ValidationException extends DefaultException {
    private Map errors;

    public ValidationException(String msg, Map errors) {
        super(msg);
        this.errors = errors;
    }

    public Map getErrors() {
        return errors;
    }
}
