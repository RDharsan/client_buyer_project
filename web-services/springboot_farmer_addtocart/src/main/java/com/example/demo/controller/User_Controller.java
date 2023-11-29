package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.SuccessResponseDTO;
import com.example.demo.dto.UserDTO;
import com.example.demo.exception.*;
import com.example.demo.service.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/users")
@Api("user")
@ApiModel("All User related operations")
public class User_Controller {


    @Autowired
    private User_Service user_Service;

    @ApiOperation(value = "User Sign Up", notes = "This api is used to register usage", httpMethod = "POST")
    @ApiResponses(value = { @ApiResponse(code = 500, message = "Internal Server error"),
            @ApiResponse(code = 401, message = "UnAuthorized") })
    @PostMapping(value = "/user", consumes = "application/json", produces = "application/json")
    public ResponseEntity<?> addProduct(@RequestBody UserDTO dto) throws DuplicateElement_Exception {
        return new ResponseEntity<SuccessResponseDTO>(new SuccessResponseDTO(user_Service.addUser(dto)), HttpStatus.CREATED);
    }



//    @ApiOperation(value = "User Login", notes = "This api is used login", httpMethod = "POST")
//    @ApiResponses(value = { @ApiResponse(code = 500, message = "Internal Server error"),
//            @ApiResponse(code = 401, message = "UnAuthorized") })
//    @PostMapping(value = "/login", consumes = "application/json", produces = "application/json")
//    public ResponseEntity<?> login(@RequestBody LoginDTO dto) throws DuplicateElementException, DataNotFoundException {
//        return new ResponseEntity<UserResponseDTO>(userService.login(dto), HttpStatus.CREATED);
//    }





}