package com.ximple.bookmanager.service.impl;

import com.ximple.bookmanager.application.dto.generated.Book;
import com.ximple.bookmanager.persistence.mapper.BookMapper;
import com.ximple.bookmanager.persistence.repository.BookRepository;
import com.ximple.bookmanager.service.BookService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

/***
 ** Unidad 3 - Principios y Patrones de Diseño
 **
 **  @author: hxa.dev
 ***/
@ExtendWith(MockitoExtension.class)
class BookServiceTest {
    @Mock
    private BookRepository bookRepository;
    private BookService bookService;

    @BeforeEach
    void setUp() {
        bookService=new BookServiceImpl(bookRepository);
    }

    @Test
    void testGetAllBooks() {

        List<com.ximple.bookmanager.persistence.entity.Book> bookEntities = Arrays.asList(
                new com.ximple.bookmanager.persistence.entity.Book(1, "Book1", "Author1", "123456", "5"),
                new com.ximple.bookmanager.persistence.entity.Book(2, "Book2", "Author2", "789012", "3")
        );

        when(bookRepository.findAll()).thenReturn(bookEntities);


        var result = bookService.getAllBooks();


        assertEquals(2, result.size());
        verify(bookRepository, times(1)).findAll();
    }

    @Test
    void testGetBookById() {

        int bookId = 1;
        com.ximple.bookmanager.persistence.entity.Book bookEntity = new com.ximple.bookmanager.persistence.entity.Book(bookId, "Book1", "Author1", "123456", "5");

        when(bookRepository.findById(bookId)).thenReturn(Optional.of(bookEntity));


        var result = bookService.getBookById(bookId);


        assertEquals(bookEntity.getId(), result.getId().get());
        assertEquals(bookEntity.getTitle(), result.getTitle());


        verify(bookRepository, times(1)).findById(bookId);
    }

    @Test
    void testCreateBook() {
        Book inputBook = new Book(null, "New Book", "New Author", "987654", "2");
        com.ximple.bookmanager.persistence.entity.Book savedBookEntity = new com.ximple.bookmanager.persistence.entity.Book(1, "New Book", "New Author", "987654", "2");

        when(bookRepository.save(any(com.ximple.bookmanager.persistence.entity.Book.class))).thenReturn(savedBookEntity);

        Book result = bookService.createBook(inputBook);

        assertEquals(savedBookEntity.getId(), result.getId().get());
        assertEquals(savedBookEntity.getTitle(), result.getTitle());

        verify(bookRepository, times(1)).save(any(com.ximple.bookmanager.persistence.entity.Book.class));
    }

    @Test
    void testDeleteBook() {
        int bookId = 1;
        bookService.deleteBook(bookId);
        verify(bookRepository, times(1)).deleteById(bookId);
    }
}