package com.ximple.bookmanager.infraestructure.exception.custom;

import com.ximple.bookmanager.infraestructure.exception.ErrorDescriptionEnum;

public class ResourceNotFoundException extends AbstractException {

    public ResourceNotFoundException() {
        super(ErrorDescriptionEnum.NOT_FOUND_ERROR.errorCode, ErrorDescriptionEnum.NOT_FOUND_ERROR.errorDescription,
                ErrorDescriptionEnum.NOT_FOUND_ERROR.httpStatus);
    }

    public ResourceNotFoundException(String errorMessage) {
        super(ErrorDescriptionEnum.NOT_FOUND_ERROR.errorCode, errorMessage, ErrorDescriptionEnum.NOT_FOUND_ERROR.httpStatus);
    }
}
