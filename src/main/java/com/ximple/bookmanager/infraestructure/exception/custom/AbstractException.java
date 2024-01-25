package com.ximple.bookmanager.infraestructure.exception.custom;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class AbstractException  extends RuntimeException{
    private final String errorCode;
    private final String errorDescription;
    private final HttpStatus httpStatus;
}