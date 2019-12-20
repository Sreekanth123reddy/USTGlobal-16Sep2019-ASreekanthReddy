package com.ustglobal.lms.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ustglobal.lms.dto.Users;
import com.ustglobal.lms.service.LogInService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*",allowCredentials = "true")
public class LoginController {
	@Autowired
	private LogInService service1;
	@PostMapping(path="/library/login/{id}/{password}",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	public Users login(@PathVariable("id")int id,@PathVariable("password") String password) {
		Users user =service1.login(id,password);
		return user;
		
	}
	@PostMapping(path="/library/admin/create",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	public Users register(@RequestBody Users users) {
		Users user = service1.register(users);
		return user;
	}

}
