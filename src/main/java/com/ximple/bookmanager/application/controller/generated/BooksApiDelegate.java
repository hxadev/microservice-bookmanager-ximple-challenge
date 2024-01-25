package com.ximple.bookmanager.application.controller.generated;

import com.ximple.bookmanager.application.dto.generated.Book;
import com.ximple.bookmanager.application.dto.generated.Error;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import jakarta.annotation.Generated;

/**
 * A delegate to be called by the {@link BooksApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-24T17:58:21.952677-06:00[America/Mexico_City]")
public interface BooksApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /books : Create a new book
     *
     * @param book  (required)
     * @return Book Created (status code 201)
     *         or Invalid request (status code 400)
     *         or Unauthorized (status code 401)
     *         or 500 Internal Server Error (status code 500)
     * @see BooksApi#createBooks
     */
    default ResponseEntity<Book> createBooks(Book book) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"quantity\" : \"1\", \"author\" : \"J.R.R Tolkien\", \"isbn\" : \"978-0-395-19395-8\", \"id\" : 10, \"title\" : \"The Lord of the Rings\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * DELETE /books/{bookId} : Delete all books
     *
     * @param bookId The book id that needs to be deleted (required)
     * @return The resource was deleted successfully (status code 204)
     *         or Invalid book id supplied (status code 400)
     *         or Unauthorized (status code 401)
     *         or The book was not found (status code 404)
     * @see BooksApi#deleteBooks
     */
    default ResponseEntity<Void> deleteBooks(Integer bookId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /books : List all the books
     *
     * @return A list of books (status code 200)
     *         or Invalid request (status code 400)
     *         or Unauthorized (status code 401)
     *         or Resource not found (status code 404)
     *         or 500 Internal Server Error (status code 500)
     * @see BooksApi#listBookss
     */
    default ResponseEntity<List<Book>> listBookss() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"quantity\" : \"1\", \"author\" : \"J.R.R Tolkien\", \"isbn\" : \"978-0-395-19395-8\", \"id\" : 10, \"title\" : \"The Lord of the Rings\" }, { \"quantity\" : \"1\", \"author\" : \"J.R.R Tolkien\", \"isbn\" : \"978-0-395-19395-8\", \"id\" : 10, \"title\" : \"The Lord of the Rings\" } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /books/{bookId} : Info for a specific pet
     *
     * @param bookId The book id (required)
     * @return The required book (status code 200)
     *         or Invalid request (status code 400)
     *         or Unauthorized (status code 401)
     *         or Resource not found (status code 404)
     *         or 500 Internal Server Error (status code 500)
     * @see BooksApi#showBookById
     */
    default ResponseEntity<Book> showBookById(Integer bookId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"quantity\" : \"1\", \"author\" : \"J.R.R Tolkien\", \"isbn\" : \"978-0-395-19395-8\", \"id\" : 10, \"title\" : \"The Lord of the Rings\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
