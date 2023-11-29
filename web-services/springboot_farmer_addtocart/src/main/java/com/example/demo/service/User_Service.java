package com.example.demo.service;


import com.example.demo.dto.*;
import com.example.demo.exception.*;
import com.example.demo.model.*;
import org.springframework.http.ResponseEntity;

public interface User_Service {

    String addUser(UserDTO dto) throws DuplicateElement_Exception;

    String updateUser(UserDTO dto, Long userId) throws DataNotFound_Exception;

    UserResponseDTO findByUserId(Long userId);

    UserResponseDTO login(LoginDTO dto) throws DataNotFound_Exception;

    String deleteUser(Long userId);
}