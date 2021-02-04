package com.zs.exec6.exceptions;

import com.zs.exec6.util.LogImplement;

public class ApplicationRunTimeExceptions extends Exception{
    int errorCode;
    String errorDescription;
    public ApplicationRunTimeExceptions(int errorCode, String errorDescription)
    {
        this.errorCode = errorCode;
        this.errorDescription = errorDescription;
        LogImplement.initialize().warning(String.valueOf(errorCode)+errorDescription);
    }
}
