package com.ximple.bookmanager.application.controller;

import com.ximple.bookmanager.application.controller.generated.UsersApiDelegate;
import com.ximple.bookmanager.application.dto.generated.UserAuth;
import com.ximple.bookmanager.persistence.entity.User;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.swagger.models.Response;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static com.ximple.bookmanager.infraestructure.properties.Constants.TOKEN_SECRET;

/***
 ** Unidad 3 - Principios y Patrones de Diseño
 **
 **  @author: hxa.dev
 ***/
@Service
public class UserController implements UsersApiDelegate {
    @Override
    public ResponseEntity<UserAuth> authUser(String user, String password) {
        String token = getJWTToken(user);
        return ResponseEntity.ok(UserAuth.builder().username(Optional.of(user)).token(Optional.of(token)).build());
    }

    private String getJWTToken(String username) {
        List<GrantedAuthority> grantedAuthorities = AuthorityUtils
                .commaSeparatedStringToAuthorityList("ROLE_USER");

        String token = Jwts
                .builder()
                .setId("ximple:1234")
                .setSubject(username)
                .claim("authorities",
                        grantedAuthorities.stream()
                                .map(GrantedAuthority::getAuthority)
                                .collect(Collectors.toList()))
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + 600000))
                .signWith(SignatureAlgorithm.HS512,
                        TOKEN_SECRET.getBytes()).compact();

        return "Bearer " + token;
    }
}
