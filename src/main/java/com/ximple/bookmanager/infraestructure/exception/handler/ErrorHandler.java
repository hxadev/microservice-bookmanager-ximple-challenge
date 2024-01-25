package com.ximple.bookmanager.infraestructure.exception.handler;

import com.ximple.bookmanager.infraestructure.exception.custom.AbstractException;
import com.ximple.bookmanager.infraestructure.exception.ErrorDescriptionEnum;
import com.ximple.bookmanager.infraestructure.exception.ErrorMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

@RestControllerAdvice
@Slf4j
public class ErrorHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(value = {Exception.class})
    public ResponseEntity<ErrorMessage> handleAnyException(Exception ex) {
        log.error("[ErrorHandler:AnyUnknownException] " + ex.getMessage());
        ex.printStackTrace();
        return new ResponseEntity<>(
                ErrorMessage.builder()
                        .errorCode(ErrorDescriptionEnum.UNKNOWN_ERROR.errorCode)
                        .errorDescription(ex.getMessage())
                        .timestamp(new Date())
                        .build(), ErrorDescriptionEnum.UNKNOWN_ERROR.httpStatus);
    }

    @ExceptionHandler(value = {AbstractException.class})
    public ResponseEntity<ErrorMessage> handleAbstractException(AbstractException ex) {
        log.error("[ErrorHandler:AnyException] " + ex.getErrorDescription());
        return new ResponseEntity<>(
                ErrorMessage.builder()
                        .errorCode(ex.getErrorCode())
                        .errorDescription(ex.getErrorDescription())
                        .timestamp(new Date())
                        .build(), ex.getHttpStatus());
    }

    @ExceptionHandler(value = { ConstraintViolationException.class })
    public ResponseEntity<ErrorMessage> handleInvalidParameter(ConstraintViolationException e) {
        log.error("[ErrorHandler:handleInvalidParameter] There is a error:  " + e.getMessage());
        Set<ConstraintViolation<?>> violations = e.getConstraintViolations();
        return new ResponseEntity<>(
                ErrorMessage.builder()
                        .errorCode(ErrorDescriptionEnum.PARAMETER_NOT_VALID_ERROR.errorCode)
                        .errorDescription(violations.stream().map(ConstraintViolation::getMessage)
                                .collect(Collectors.joining(", ")))
                        .timestamp(new Date())
                        .build(),
                ErrorDescriptionEnum.PARAMETER_NOT_VALID_ERROR.httpStatus);
    }


    private Map<String, Set<String>> manageValidationError(List<FieldError> fieldErrors) {
        return fieldErrors.stream().collect(
                Collectors.groupingBy(FieldError::getField,
                        Collectors.mapping(FieldError::getDefaultMessage, Collectors.toSet())));
    }
}
