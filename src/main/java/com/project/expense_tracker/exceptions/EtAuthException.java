package com.project.expense_tracker.exceptions;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class EtAuthException extends RuntimeException {
    public EtAuthException(String message){
        super(message);
    }
    
}
