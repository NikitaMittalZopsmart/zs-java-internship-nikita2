package com.zs.exec6.exceptionHandler;

import com.zs.exec6.exceptions.BadRequestException;
import com.zs.exec6.exceptions.MyCustomException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MyExceptionsHandler extends RuntimeException{
   @ExceptionHandler(MyCustomException.class)
    public ResponseEntity<Object> myMessage(MyCustomException e)
   {
       return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
   }
   @ExceptionHandler(BadRequestException.class)
    public ResponseEntity<Object> myMessage(BadRequestException b)
   {
       return new ResponseEntity<>(b.getMessage(),HttpStatus.BAD_REQUEST);
   }

}
