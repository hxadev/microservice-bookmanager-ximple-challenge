package com.ximple.bookmanager.persistence.repository;

import com.ximple.bookmanager.persistence.entity.Book;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

/***
 ** Unidad 3 - Principios y Patrones de Diseño
 **
 **  @author: hxa.dev
 ***/
public interface BookRepository extends JpaRepository<Book,Integer> {
}
