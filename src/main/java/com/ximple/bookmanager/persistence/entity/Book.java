package com.ximple.bookmanager.persistence.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.io.Serializable;
import java.util.Objects;
import java.util.Optional;

/**
 * Book
 */
@lombok.Data
@lombok.Builder
@lombok.Getter
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
@Entity
@Table(name="books")
public class Book implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="id")
  private Integer id;

  @Column(name="title", unique = true, length = 100)
  private String title;

  @Column(name="author")
  private String author;

  @Column(name = "isbn", unique = true)
  private String isbn;

  @Column(name = "quantity")
  private String quantity;

}

