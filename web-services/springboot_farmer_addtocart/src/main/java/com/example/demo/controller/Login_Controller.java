package com.example.demo.controller;


import com.example.demo.dto.LoginDTO;
import com.example.demo.dto.UserResponseDTO;
import com.example.demo.exception.*;
import com.example.demo.service.*;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Hi on 04-02-2018.
 */
@RestController
@RequestMapping("/login")
@Api("login")
@ApiModel("User Login")
public class Login_Controller {

    @Autowired
    private User_Service user_Service;

    @ApiOperation(value = "User Login", notes = "This api is used login", httpMethod = "POST")
    @ApiResponses(value = { @ApiResponse(code = 500, message = "Internal Server error"),
            @ApiResponse(code = 401, message = "UnAuthorized") })
    @PostMapping(consumes = "application/json", produces = "application/json")
    public ResponseEntity<?> login(@RequestBody LoginDTO dto) throws DuplicateElement_Exception, DataNotFound_Exception {
        return new ResponseEntity<UserResponseDTO>(user_Service.login(dto), HttpStatus.CREATED);
    }
}