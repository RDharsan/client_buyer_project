package com.example.demo.service.serviceImpl;

import com.example.demo.model.*;
import com.example.demo.service.*;

import java.util.List;

public class OrderServiceImpl implements Order_Service {

    @Override
    public ProductOrder_model placeOrder(ProductOrder_model dto) {
        return null;
    }

    @Override
    public ProductOrder_model findByOrderId(Long orderId) {
        return null;
    }

    @Override
    public List<ProductOrder_model> findByUserId(Long userId) {
        return null;
    }

    @Override
    public ProductOrder_model updateOrder(ProductOrder_model dto, Long orderId) {
        return null;
    }

    @Override
    public String cancelOrder(Long orderId) {
        return null;
    }
}