package com.example.demo.config;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

import com.example.demo.repo.UserRepository;
import com.example.demo.service.MyUserDetailsService;
@Component
public class CustomAuthenticationProvider implements AuthenticationProvider {
    public Authentication authenticate(Authentication authentication) 
      throws AuthenticationException {
 
      MyUserDetailsService myUserDetailsService;
    	
        String name = authentication.getName();
        String password = authentication.getCredentials().toString();
        
        if (name.equals("admin")&&password.equals("password")) {
 
            // use the credentials
            // and authenticate against the third-party system
            return new UsernamePasswordAuthenticationToken(
              name, password, new ArrayList<>());
        } else {
            return null;
        }
    }
    @Override
    public boolean supports(Class<?> authentication) {
        return authentication.equals(UsernamePasswordAuthenticationToken.class);
    }
}
