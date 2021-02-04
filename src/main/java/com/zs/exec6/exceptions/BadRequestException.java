package com.zs.exec6.exceptions;

public class BadRequestException extends Exception{
    public BadRequestException()
    {
        super("This is the bad request");
    }
}
