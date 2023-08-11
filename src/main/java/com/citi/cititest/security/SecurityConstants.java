/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.citi.cititest.security;

/**
 *
 * @author luis
 */
public class SecurityConstants {
        
    // Spring Security
    public static final String LOGIN_URL = "/login";
    public static final String HEADER_AUTHORIZACION_KEY = "Authorization";
    public static final String TOKEN_BEARER_PREFIX = "Bearer ";

    // JWT

    public static final String ISSUER_INFO = "luisfloresn";
    public static final String SECRET_KEY = "1234";
    public static final long TOKEN_EXPIRATION_TIME = 864_000_000; // 10 dias
    
}
