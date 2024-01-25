package com.ximple.bookmanager.application.controller;

import com.ximple.bookmanager.application.controller.generated.BooksApiDelegate;
import com.ximple.bookmanager.application.dto.generated.Book;
import com.ximple.bookmanager.service.BookService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class BooksController implements BooksApiDelegate {

    private final BookService bookService;
    @Override
    public ResponseEntity<Book> createBooks(Book book) {
        return ResponseEntity.ok(bookService.createBook(book));
    }

    @Override
    public ResponseEntity<Void> deleteBooks(Integer bookId) {
        bookService.deleteBook(bookId);
        return ResponseEntity.noContent().build();
    }

    @Override
    public ResponseEntity<List<Book>> listBookss() {
        return ResponseEntity.ok(bookService.getAllBooks());
    }

    @Override
    public ResponseEntity<Book> showBookById(Integer bookId) {
        return ResponseEntity.ok(bookService.getBookById(bookId));
    }
}
