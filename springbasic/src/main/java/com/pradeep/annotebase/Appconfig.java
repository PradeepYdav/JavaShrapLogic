package com.pradeep.annotebase;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Appconfig {

	@Bean
	public Samsung getconf() {
		return new Samsung();
	}
	
	@Bean
	public MobileProcessor getperfo() {
		return new SnapDragon();
	}
	
}
