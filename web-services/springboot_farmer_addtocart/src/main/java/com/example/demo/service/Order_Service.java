package com.example.demo.service;


import com.example.demo.model.*;

import java.util.List;

public interface Order_Service {

    ProductOrder_model placeOrder(ProductOrder_model dto);

    ProductOrder_model findByOrderId(Long orderId);

    List<ProductOrder_model> findByUserId(Long userId);

    ProductOrder_model updateOrder(ProductOrder_model dto, Long orderId);

    String cancelOrder(Long orderId);

}
