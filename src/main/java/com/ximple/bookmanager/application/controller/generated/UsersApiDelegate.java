package com.ximple.bookmanager.application.controller.generated;

import com.ximple.bookmanager.application.dto.generated.Error;
import com.ximple.bookmanager.application.dto.generated.UserAuth;
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
 * A delegate to be called by the {@link UsersApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-24T17:58:21.952677-06:00[America/Mexico_City]")
public interface UsersApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /users : Endpoint to authenticate the user and retrieve JWT
     *
     * @param user  (required)
     * @param password  (required)
     * @return Authentication sucessfully (status code 200)
     *         or Authentication failed (status code 401)
     * @see UsersApi#authUser
     */
    default ResponseEntity<UserAuth> authUser(String user,
        String password) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"username\" : \"admin\", \"token\" : \"=123312zxc1\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
