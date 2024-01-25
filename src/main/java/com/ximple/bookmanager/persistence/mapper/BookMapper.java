package com.ximple.bookmanager.persistence.mapper;

/***
 ** Unidad 3 - Principios y Patrones de Diseño
 **
 **  @author: hxa.dev
 ***/

import com.ximple.bookmanager.application.dto.generated.Book;

import java.util.Optional;

public class BookMapper {
    public static Book toDto(com.ximple.bookmanager.persistence.entity.Book entity) {
        return Book.builder()
                .id(Optional.of(entity.getId()))
                .title(entity.getTitle())
                .author(entity.getAuthor())
                .isbn(entity.getIsbn())
                .quantity(entity.getIsbn()).build();
    }

    public static com.ximple.bookmanager.persistence.entity.Book toEntity(Book entity){
        return com.ximple.bookmanager.persistence.entity.Book.builder()
                .title(entity.getTitle())
                .author(entity.getAuthor())
                .isbn(entity.getIsbn())
                .quantity(entity.getQuantity())
                .build();
    }

    public static Book toDto(Integer id, String title, String author, String isbn, String quantity) {
        return Book.builder()
                .id(Optional.of(id))
                .title(title)
                .author(author)
                .isbn(isbn)
                .quantity(quantity).build();
    }
}
