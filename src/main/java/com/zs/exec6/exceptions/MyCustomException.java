package com.zs.exec6.exceptions;

public class MyCustomException extends Exception{
    public MyCustomException()
    {
        super("Resources are not found");
    }
}
