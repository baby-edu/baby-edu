/*
package com.hayfar.baby_education.security;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hayfar.baby_education.entity.Admin;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.stereotype.Component;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import static com.hayfar.baby_education.security.SecurityConstants.*;


public class JWTAuthenticationFilter extends UsernamePasswordAuthenticationFilter {

        private AuthenticationManager authenticationManager;
        @Autowired
        public JWTAuthenticationFilter(AuthenticationManager authenticationManager) {
            this.authenticationManager = authenticationManager;
        }

        @Override
        public Authentication attemptAuthentication(HttpServletRequest req,
                                                    HttpServletResponse res) throws AuthenticationException {
            try {
                Admin creds = new ObjectMapper()
                        .readValue(req.getInputStream(), Admin.class);

                return authenticationManager.authenticate(
                        new UsernamePasswordAuthenticationToken(
                                creds.getUserName(),
                                creds.getPassword(),
                                new ArrayList<>())
                );
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        @Override
        protected void successfulAuthentication(HttpServletRequest req,
                                                HttpServletResponse res,
                                                FilterChain chain,
                                                Authentication auth) throws IOException, ServletException {

            String token = Jwts.builder()
                    .setSubject(((User) auth.getPrincipal()).getUsername())
                    .setExpiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
                    .signWith(SignatureAlgorithm.HS512, SECRET.getBytes())
                    .compact();
            res.addHeader(HEADER_STRING, TOKEN_PREFIX + token);
        }
}*/
