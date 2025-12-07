package com.bookticket.controllers;

import java.time.LocalDateTime;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bookticket.bindings.MyUserDto;
import com.bookticket.bindings.MyUserResponseDto;
import com.bookticket.custommessages.CustomeMessageResponse;
import com.bookticket.services.UserService;

@RestController
@RequestMapping(value = "/api/v1/user")
public class UserController {
	@Autowired
	private UserService userService;
    @PostMapping(
			value = "/",
			produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_ATOM_XML_VALUE},
			consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_ATOM_XML_VALUE}
			)
	public ResponseEntity<CustomeMessageResponse> createUserHandler(@RequestBody MyUserDto myUserDto){
		System.out.println("inside createUserHandler()");
		boolean saveUser = userService.saveUser(myUserDto);
		if(saveUser)
			return new ResponseEntity<CustomeMessageResponse>(new CustomeMessageResponse(UUID.randomUUID().toString(), "user crated succesflly", LocalDateTime.now()), HttpStatus.CREATED);
		return new ResponseEntity<CustomeMessageResponse>(new CustomeMessageResponse(UUID.randomUUID().toString(), "user not crated", LocalDateTime.now()), HttpStatus.BAD_REQUEST);
	}
	
	@GetMapping(
			value = "/{id}",
			produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_ATOM_XML_VALUE}
			)
	public ResponseEntity<MyUserResponseDto> getUserByIdUserHandler(@PathVariable String id){
		System.out.println("inside getUserByIdUserHandler()");
		MyUserResponseDto userById = userService.getUserById(id);
		if(userById!=null)
			 return new ResponseEntity<MyUserResponseDto>(userById, HttpStatus.OK);
		return null;
		
	}
	/*
	@PutMapping(
			value = "/{id}",
			produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_ATOM_XML_VALUE},
			consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_ATOM_XML_VALUE}
			)
	public ResponseEntity<CustomeMessageResponse> createUserHandler(@RequestBody MyUserDto myUserDto, @PathVariable Integer id){
		System.out.println("inside createUserHandler()");
		
	}
	
	@DeleteMapping(
			value = "/{id}",
			produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_ATOM_XML_VALUE},
			consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_ATOM_XML_VALUE}
			)
	public ResponseEntity<CustomeMessageResponse> createUserHandler(@PathVariable Integer id){
		System.out.println("inside createUserHandler()");
		
	}*/
}
