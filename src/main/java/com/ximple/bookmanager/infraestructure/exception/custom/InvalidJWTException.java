package com.ximple.bookmanager.infraestructure.exception.custom;

import com.ximple.bookmanager.infraestructure.exception.ErrorDescriptionEnum;

public class InvalidJWTException extends AbstractException {

    public InvalidJWTException() {
        super(ErrorDescriptionEnum.FORBIDDEN_ACCESS.errorCode, ErrorDescriptionEnum.FORBIDDEN_ACCESS.errorDescription,
                ErrorDescriptionEnum.FORBIDDEN_ACCESS.httpStatus);
    }

    public InvalidJWTException(String errorMessage) {
        super(ErrorDescriptionEnum.FORBIDDEN_ACCESS.errorCode, errorMessage, ErrorDescriptionEnum.FORBIDDEN_ACCESS.httpStatus);
    }
}
