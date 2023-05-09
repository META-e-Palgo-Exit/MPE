package com.mpe.mpeuser.Controller;

import org.apache.catalina.User;
import org.apache.coyote.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mpe.mpeuser.Dto.UserDto;
import com.mpe.mpeuser.Service.UserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	private final UserService userService;

	@PostMapping("/")
	public ResponseEntity setUserInfo(@RequestBody UserDto userDto) throws Exception{
		if(logger.isDebugEnabled()){
			logger.debug("START, setUserInfo" + userDto.getUserId());
		}
		try{
			return new ResponseEntity<>(userService.setUserInfo(userDto), HttpStatus.OK);
		}catch (Exception exception){
			return new ResponseEntity<>(exception.getMessage(), HttpStatus.BAD_REQUEST);
		}

	}
	@GetMapping("/")
	public ResponseEntity getUserInfo(@RequestBody UserDto userDto){
		if(logger.isDebugEnabled()){
			logger.debug("START, getUserInfo" + userDto.getUserId());
		}
		try{
			return new ResponseEntity<>(userService.getUserInfo(userDto), HttpStatus.OK);
		}catch (Exception exception){
			return new ResponseEntity<>(exception.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}
	@PutMapping
	public ResponseEntity updateUserInfo(@RequestBody UserDto userDto){
		if(logger.isDebugEnabled()){
			logger.debug("START, setUserInfo" + userDto.getUserId());
		}
		try{
			return new ResponseEntity<>(userService.updateUserInfo(userDto), HttpStatus.OK);
		}catch (Exception exception){
			return new ResponseEntity<>(exception.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}
	@DeleteMapping("/")
	public ResponseEntity deleteUserInfo(@RequestBody UserDto userDto){
		if(logger.isDebugEnabled()){
			if(logger.isDebugEnabled()){
				logger.debug("START, deleteUserInfo" + userDto.getUserId());
			}
		}
		try{
			return new ResponseEntity<>(userService.deleteUserInfo(userDto), HttpStatus.OK);
		}catch (Exception exception){
			return new ResponseEntity<>(exception.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}

}
