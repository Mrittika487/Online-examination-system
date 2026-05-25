package com.example.exam;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http)
            throws Exception {

        http

            .csrf(csrf -> csrf.disable())

            .authorizeHttpRequests(auth -> auth

                .requestMatchers(
                        "/",
        "/login",
        "/register",
        "/dashboard",
        "/leaderboard",
        "/admin",
        "/result",
        "/certificate",
        "/exam",
        "/css/**",
        "/js/**",
        "/images/**"
                ).permitAll()

                .anyRequest().authenticated()
            )

            .formLogin(form -> form

                .loginPage("/")

                .loginProcessingUrl("/login")

                .defaultSuccessUrl("/dashboard", true)

                .failureUrl("/?error=true")

                .permitAll()
            )

            .logout(logout -> logout

                .logoutSuccessUrl("/")

                .permitAll()
            );

        return http.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {

        return NoOpPasswordEncoder.getInstance();

    }
}