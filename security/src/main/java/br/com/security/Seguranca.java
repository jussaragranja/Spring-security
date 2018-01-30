package br.com.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;

@Configuration
public class Seguranca {
	
	@Autowired
	public void configurationGlobal(AuthenticationManagerBuilder builder) {
		
		try {
			builder.inMemoryAuthentication()
			.withUser("Ju").password("123").roles("ADMIN")
			.and()
			.withUser("GG").password("321").roles("MASTER");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
