package com.ximple.bookmanager.infraestructure.exception;

import org.springframework.http.HttpStatus;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ErrorDescriptionEnum {
        NOT_FOUND_ERROR("ERR-01", "Unable to find resource using supplied information.",
                        HttpStatus.NOT_FOUND),
        PARAMETER_NOT_VALID_ERROR("ERR-02", "Badly formatted request",
                        HttpStatus.BAD_REQUEST),
        UNEXPECTED_ERROR("ERR-03", "There was an unexpected error.",
                        HttpStatus.INTERNAL_SERVER_ERROR),
        UNAUTHORIZED_ACCESS("ERR-04", "Unable to perform operation due to insufficient privilege.",
                        HttpStatus.UNAUTHORIZED),
        FORBIDDEN_ACCESS("ERR-05", "The request is forbidden.",
                        HttpStatus.FORBIDDEN),
        INVALID_JWT("ERR-06", "The provided Authorization is invalid. Verify your Authorization header credentials.",
                        HttpStatus.UNAUTHORIZED),
        UNKNOWN_ERROR("ERR-07", "Unable to process request due to an internal server error", HttpStatus.INTERNAL_SERVER_ERROR);
        public final String errorCode;
        public final String errorDescription;
        public final HttpStatus httpStatus;
}