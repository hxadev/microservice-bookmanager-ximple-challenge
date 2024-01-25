package com.ximple.bookmanager.infraestructure.exception.custom;

import com.ximple.bookmanager.infraestructure.exception.ErrorDescriptionEnum;

public class BadRequestException extends AbstractException {

    public BadRequestException() {
        super(ErrorDescriptionEnum.PARAMETER_NOT_VALID_ERROR.errorCode,
                ErrorDescriptionEnum.PARAMETER_NOT_VALID_ERROR.errorDescription,
                ErrorDescriptionEnum.PARAMETER_NOT_VALID_ERROR.httpStatus);
    }

    public BadRequestException(String errorMessage) {
        super(ErrorDescriptionEnum.PARAMETER_NOT_VALID_ERROR.errorCode, errorMessage,
                ErrorDescriptionEnum.PARAMETER_NOT_VALID_ERROR.httpStatus);
    }
}