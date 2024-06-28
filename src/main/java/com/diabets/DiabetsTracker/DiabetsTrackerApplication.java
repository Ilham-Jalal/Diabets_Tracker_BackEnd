package com.diabets.DiabetsTracker;

//import com.diabets.DiabetsTracker.model.User;
//import com.diabets.DiabetsTracker.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class DiabetsTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiabetsTrackerApplication.class, args);
	}
//	@Bean
//	CommandLineRunner init(UserRepository userRepository) {
//		return args -> {
//			Stream.of("John", "Julie", "Jennifer", "Helen", "Rachel").forEach(name -> {
//				User user = new User(name, name.toLowerCase() + "@domain.com");
//				userRepository.save(user);
//			});
//			userRepository.findAll().forEach(System.out::println);
//		};
//	}
}
