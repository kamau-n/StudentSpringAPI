package com.example.StudentApi.Security;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

@Component
public class JwtAuthFilter  extends OncePerRequestFilter {

    @Override
    protected  void doFilterInternal (
            HttpServletRequest request,
            HttpServletResponse response,
            FilterChain filterChain) throws ServletException , IOException {
        final String authHeader =request.getHeader(AUTHORIZATION);
        final String email;
        final String jwtToken;



    }


    )


}
