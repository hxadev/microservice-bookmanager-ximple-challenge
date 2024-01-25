package com.ximple.bookmanager.infraestructure.exception.custom;

import com.ximple.bookmanager.infraestructure.exception.ErrorDescriptionEnum;

public class ForbiddenException extends AbstractException {

    public ForbiddenException() {
        super(ErrorDescriptionEnum.FORBIDDEN_ACCESS.errorCode, ErrorDescriptionEnum.FORBIDDEN_ACCESS.errorDescription,
                ErrorDescriptionEnum.FORBIDDEN_ACCESS.httpStatus);
    }

    public ForbiddenException(String errorMessage) {
        super(ErrorDescriptionEnum.FORBIDDEN_ACCESS.errorCode, errorMessage, ErrorDescriptionEnum.FORBIDDEN_ACCESS.httpStatus);
    }
}
