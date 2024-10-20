package com.nourdine.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.nourdine.users.entities.Role;
import com.nourdine.users.entities.User;
import com.nourdine.users.service.UserService;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class UsersMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsersMicroserviceApplication.class, args);
	}
	
	@Autowired
	UserService userService;

	
//	@PostConstruct
//	void init_users() {
// 	userService.addRole(new Role(null,"ADMIN"));
//	userService.addRole(new Role(null,"USER"));
// 
//	userService.saveUser(new User(null,"admin","123",true,null));
//	userService.saveUser(new User(null,"nourdine","123",true,null));
//	userService.saveUser(new User(null,"yassine","123",true,null));
// 
//	userService.addRoleToUser("admin", "ADMIN");
//	userService.addRoleToUser("admin", "USER");
//	userService.addRoleToUser("nourdine", "USER");
//	userService.addRoleToUser("yassine", "USER");
//	} 
	
	//@Bean
	//BCryptPasswordEncoder getBCE() {
	//return new BCryptPasswordEncoder();
	//}
}
