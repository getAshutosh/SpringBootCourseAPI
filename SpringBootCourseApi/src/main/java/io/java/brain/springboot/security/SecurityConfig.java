package io.java.brain.springboot.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	//Authentication : user-->Role
	protected void configure(AuthenticationManagerBuilder auth) throws Exception{
		auth.inMemoryAuthentication().withUser("user1").password("password1").roles("USER")
										.and().withUser("admin1").password("admin1").roles("USER","ADMIN");
										
	}
	
	protected void configure(HttpSecurity http) throws Exception {
		http.httpBasic().and().authorizeRequests().antMatchers("/topics/**").hasRole("USER")
													.antMatchers("/**").hasRole("ADMIN").and()
													.csrf().disable().headers().frameOptions().disable();
									
									
	}
}
