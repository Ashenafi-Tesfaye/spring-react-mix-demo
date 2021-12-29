package com.AGrespapi.AGrespapidemo.securityConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.AGrespapi.AGrespapidemo.service.UserDetailServiceImpl;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Bean
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	 @Autowired
	 private UserDetailServiceImpl userDetailsService;
	 
	 @Autowired
	 public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		 auth.userDetailsService(userDetailsService)
		 .passwordEncoder(new BCryptPasswordEncoder());
	 }

	 
	 @Override
	 protected void configure(HttpSecurity http) throws Exception {
		 http.csrf().disable().cors().and().authorizeRequests()
		  .antMatchers(HttpMethod.POST, "/login").permitAll();
	       /* .anyRequest().authenticated()
	        .and()
	        // Filter for the api/login requests
	        .addFilterBefore(new LoginFilter("/login", 
	        	authenticationManager()),
	                UsernamePasswordAuthenticationFilter.class)
	        // Filter for other requests to check JWT in header
	        .addFilterBefore(new AuthenticationFilter(),
	                UsernamePasswordAuthenticationFilter.class);*/
	  }
  
	
}
