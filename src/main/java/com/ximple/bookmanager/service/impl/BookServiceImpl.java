package com.ximple.bookmanager.service.impl;

import com.ximple.bookmanager.application.dto.generated.Book;
import com.ximple.bookmanager.persistence.mapper.BookMapper;
import com.ximple.bookmanager.persistence.repository.BookRepository;
import com.ximple.bookmanager.service.BookService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/***
 ** Unidad 3 - Principios y Patrones de Diseño
 **
 **  @author: hxa.dev
 ***/
@Service
@Slf4j
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;

    @Override
    public List<com.ximple.bookmanager.application.dto.generated.Book> getAllBooks() {
        return bookRepository.findAll().stream()
                .map(BookMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public com.ximple.bookmanager.application.dto.generated.Book getBookById(Integer Id) {
        return Optional.ofNullable(BookMapper.toDto(bookRepository.findById(Id).get())).get();
    }

    @Override
    public Book createBook(Book book) {
        return BookMapper.toDto(bookRepository.save(BookMapper.toEntity(book)));
    }

    @Override
    public void deleteBook(Integer id) {
        bookRepository.deleteById(id);
    }
}
