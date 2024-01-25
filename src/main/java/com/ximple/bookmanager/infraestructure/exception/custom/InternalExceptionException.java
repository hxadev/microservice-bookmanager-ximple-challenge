package com.ximple.bookmanager.infraestructure.exception.custom;

import com.ximple.bookmanager.infraestructure.exception.ErrorDescriptionEnum;

public class InternalExceptionException extends AbstractException {

    public InternalExceptionException() {
        super(ErrorDescriptionEnum.UNEXPECTED_ERROR.errorCode, ErrorDescriptionEnum.UNEXPECTED_ERROR.errorDescription,
                ErrorDescriptionEnum.UNEXPECTED_ERROR.httpStatus);
    }

    public InternalExceptionException(String errorMessage) {
        super(ErrorDescriptionEnum.UNEXPECTED_ERROR.errorCode, errorMessage, ErrorDescriptionEnum.UNEXPECTED_ERROR.httpStatus);
    }
}
