package com.openwebinars.spring.seguridad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
	/*
	@Autowired
	UserDetailsService userDetailsService;
	*/
	//Algoritmo de cifrado
	@Bean
    protected BCryptPasswordEncoder getPassWordEncoder() {
        return new BCryptPasswordEncoder();
    }
	

	/*
	@Bean
	protected DaoAuthenticationProvider authProvider() {
		DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
		authProvider.setUserDetailsService(userDetailsService);
		authProvider.setPasswordEncoder(getPassWordEncoder());
		return authProvider;
	}
	*/
	
	

	@Bean
	protected SecurityFilterChain filter(HttpSecurity http) throws Exception {
		
		http
			.authorizeHttpRequests(auth -> auth
				.requestMatchers(AntPathRequestMatcher.antMatcher("/")).permitAll()
				.requestMatchers(AntPathRequestMatcher.antMatcher("/css/**")).permitAll()
				.requestMatchers(AntPathRequestMatcher.antMatcher("/webjars/**")).permitAll()
				.requestMatchers(AntPathRequestMatcher.antMatcher("/h2-console/**")).permitAll()
				.requestMatchers(AntPathRequestMatcher.antMatcher("/login")).permitAll()
				.anyRequest().authenticated() // Cualquier otra ruta requerirá autenticación
				)
			.formLogin(login -> login.loginPage("/login") //Página por defecto login
									.defaultSuccessUrl("/index", true) //Si el login es correcto, página por defecto
									.loginProcessingUrl("/login-post") // Controlador que manejará la autenticación. Lo implementa Spring Security
									.permitAll() //
					)
			.logout(logout -> logout
									.logoutUrl("/logout") // Cuanto mandemos al usuario a esta ruta en POST se deslogueará automáticamente
									.logoutSuccessUrl("/")	//Cuando se desloguee
			
					)
			//Esto son opciones de seguridad que quitamos necesarias para acceder a H2 console
			.csrf(csrf -> csrf.disable())
			.headers(headers -> headers.frameOptions( frame -> frame.disable())
			);
									
		
		return http.build();
	}

}
