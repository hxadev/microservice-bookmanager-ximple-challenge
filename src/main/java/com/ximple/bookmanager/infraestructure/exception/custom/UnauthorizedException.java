package com.ximple.bookmanager.infraestructure.exception.custom;

import com.ximple.bookmanager.infraestructure.exception.ErrorDescriptionEnum;

public class UnauthorizedException extends AbstractException {

    public UnauthorizedException() {
        super(ErrorDescriptionEnum.UNAUTHORIZED_ACCESS.errorCode, ErrorDescriptionEnum.UNAUTHORIZED_ACCESS.errorDescription,
                ErrorDescriptionEnum.UNAUTHORIZED_ACCESS.httpStatus);
    }

    public UnauthorizedException(String errorMessage) {
        super(ErrorDescriptionEnum.UNAUTHORIZED_ACCESS.errorCode, errorMessage,
                ErrorDescriptionEnum.UNAUTHORIZED_ACCESS.httpStatus);
    }
}
