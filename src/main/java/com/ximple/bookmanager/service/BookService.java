package com.ximple.bookmanager.service;


import com.ximple.bookmanager.application.dto.generated.Book;

import java.util.List;

/***
 ** Unidad 3 - Principios y Patrones de Diseño
 **
 **  @author: hxa.dev
 ***/
public interface BookService {
    List<Book> getAllBooks();
    Book getBookById(Integer Id);
    Book createBook(Book book);
    void deleteBook(Integer id);
}
