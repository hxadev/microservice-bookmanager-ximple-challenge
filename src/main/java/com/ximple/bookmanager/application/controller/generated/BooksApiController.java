package com.ximple.bookmanager.application.controller.generated;

import com.ximple.bookmanager.application.dto.generated.Book;
import com.ximple.bookmanager.application.dto.generated.Error;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import jakarta.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-24T11:39:06.644107-06:00[America/Mexico_City]")
@RestController
@RequestMapping("${openapi.booksManagerTechnicalChallengeXimple.base-path:/bookmanager/api}")
public class BooksApiController implements BooksApi {

    private final BooksApiDelegate delegate;

    public BooksApiController(@Autowired(required = false) BooksApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new BooksApiDelegate() {
        });
    }

    @Override
    public BooksApiDelegate getDelegate() {
        return delegate;
    }

}
