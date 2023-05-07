package com.stage.sprint3.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
//        http
//                .authorizeRequests()
//                // "/"Quand/la maison est accessible à tous les utilisateurs
//                .antMatchers("/", "/index").permitAll()
//                //L'accès à d'autres que ceux ci-dessus nécessite une authentification
//                .anyRequest().authenticated()
//                .and()
//                //Spécifications et autorisations d'URL de connexion et de déconnexion pour tous les utilisateurs
//                .formLogin()
//                .loginPage("/login")
//                .permitAll()
//                .and()
//                .logout(/logout)
//                .permitAll();
    }
}
