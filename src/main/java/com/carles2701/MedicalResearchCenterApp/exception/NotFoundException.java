package com.carles2701.MedicalResearchCenterApp.exception;

import java.rmi.UnexpectedException;

public class NotFoundException extends UnexpectedException {

    public NotFoundException(String message){
        super(message);
    }
}
