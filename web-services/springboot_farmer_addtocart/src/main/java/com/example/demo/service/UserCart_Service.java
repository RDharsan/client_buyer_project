package com.example.demo.service;
import com.example.demo.model.*;

import java.util.List;

public interface UserCart_Service {

    List<UserCart_model> addItem(List<UserCart_model> dtos);

    UserCart_model updateItem(UserCart_model dto, Long cartId);

    List<UserCart_model> findAll();

    String deleteById(Long cartId);

}