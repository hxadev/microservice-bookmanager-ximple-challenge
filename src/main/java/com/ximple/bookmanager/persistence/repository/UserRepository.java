package com.ximple.bookmanager.persistence.repository;

import com.ximple.bookmanager.persistence.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/***
 ** Unidad 3 - Principios y Patrones de Diseño
 **
 **  @author: hxa.dev
 ***/
public interface UserRepository extends JpaRepository<User,Integer> {
    User findByUsername(String username);
}
