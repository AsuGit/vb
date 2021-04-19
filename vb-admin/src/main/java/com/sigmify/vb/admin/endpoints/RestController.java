package com.sigmify.vb.admin.endpoints;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sigmify.vb.admin.dto.UserDTO;
import com.sigmify.vb.admin.service.IUserService;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/user")
public class RestController {
	@Autowired
	private IUserService userService;

	@PostMapping("/save")
	public ResponseEntity<String> saveUser(@RequestBody UserDTO userDto) throws Exception{
		Long id=userService.saveUser(userDto);
		return new ResponseEntity<String>("User data saved with "+id,HttpStatus.OK);
	}

}
