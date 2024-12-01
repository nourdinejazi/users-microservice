package com.nourdine.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
 
import com.nourdine.users.service.UserService;

@SpringBootApplication
@EnableEurekaServer
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
