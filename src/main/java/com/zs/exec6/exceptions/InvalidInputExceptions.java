package com.zs.exec6.exceptions;

import com.zs.exec6.util.LogImplement;

import java.text.ParseException;

public class InvalidInputExceptions extends Exception{
    int errorCode;
    String errorDescription;
    public InvalidInputExceptions(int errorCode, String errorDescription)
    {
        this.errorCode = errorCode;
        this.errorDescription = errorDescription;
        LogImplement.initialize().info(String.valueOf(errorCode)+errorDescription);
    }


}
