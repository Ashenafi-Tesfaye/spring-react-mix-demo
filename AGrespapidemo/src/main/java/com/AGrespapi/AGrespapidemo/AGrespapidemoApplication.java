package com.AGrespapi.AGrespapidemo;

import java.util.Arrays;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;


@SpringBootApplication
@ComponentScan("com.AGrespapi.AGrespapidemo")
public class AGrespapidemoApplication {
	
	
	
	 
	 
	/*
	 * private Logger logger = LoggerFactory.getLogger(getClass());
	 * 
	 * @Autowired private EmployeeRepository employeeRepository;
	 * 
	 * @Autowired private DepartmentRepository departmentRepository;
	 * 
	 * @Autowired private UserRepository userRepository;
	 */


	public static void main(String[] args) {
		SpringApplication.run(AGrespapidemoApplication.class, args);
	}
	@Bean
	  CorsConfigurationSource corsConfigurationSource() {
	      UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
	      CorsConfiguration config = new CorsConfiguration();
			config.setAllowedOriginPatterns(Arrays.asList("*"));
			config.setAllowedMethods(Arrays.asList("*"));
			config.setAllowedHeaders(Arrays.asList("*"));
			config.setAllowCredentials(true);
	      config.applyPermitDefaultValues();
	      
	      source.registerCorsConfiguration("/**", config);
	      return source;
	}	
	/*
	 * @Bean CommandLineRunner runner() { return args -> {
	 * 
	 * Department HR = new Department ("Human Resource"); Department Finance = new
	 * Department("Finance"); Department IT = new Department ("IT"); Department
	 * Program = new Department("Program");
	 * 
	 * 
	 * departmentRepository.save(HR); departmentRepository.save(Finance);
	 * departmentRepository.save(IT); departmentRepository.save(Program);
	 * 
	 * 
	 * employeeRepository.save(new Employee("Ashuka", "Tesfaye", 1998, "Programmer",
	 * 19, 17, 82000, "none", Program)); employeeRepository.save(new
	 * Employee("Martha", "Gojam", 1988, "Clerck", 19, 17, 33000, "none", HR));
	 * employeeRepository.save(new Employee("Challa", "Kebede", 2000, "Cashier", 19,
	 * 17, 25000, "none", Finance)); employeeRepository.save(new Employee("Mustafa",
	 * "Tesfu", 2001, "Accountant", 19, 17, 14000, "none", Finance));
	 * employeeRepository.save(new Employee("Ashuka", "Tesfaye", 1889, "Director",
	 * 19, 17, 2000, "none", Program)); employeeRepository.save(new
	 * Employee("Mesay", "Filagot", 1981, "DBA", 9, 13, 8000, "none", IT));
	 * 
	 * //username: user password: user userRepository.save(new User("user",
	 * "$2a$10$1XjCH1BSn6nfJ.IRfIKcLevH6tNoLpDazE5dT6HpW48tUwYlOe13C", "USER"));
	 * 
	 *
	 * 
	 * //username: admin password: admin userRepository.save(new User("admin",
	 * "$2a$10$31EX11jr/X7DRMtGFNkXQ.gk.5QOVSl3tD6xH4UhwmZG5UTIe7IEi", "ADMIN")); };
	 * 
	 * 
	 * }
	 */
	
	
	
}

