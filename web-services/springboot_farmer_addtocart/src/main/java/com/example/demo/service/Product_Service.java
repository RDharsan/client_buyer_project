package com.example.demo.service;

import com.example.demo.dto.*;
import com.example.demo.exception.*;
import com.example.demo.repository.*;

import java.util.List;

public interface Product_Service {

    String addProduct(ProductDTO dto);

    String uploadProducts(List<ProductDTO> products) throws Conflict_Exception;

    ProductDTO findProductById(Long productId);

    List<ProductDTO> retrieveProducts();

    String updateProduct(ProductDTO dto, Long productId) throws DataNotFound_Exception;

    String deleteProduct(Long productId) throws DataNotFound_Exception;
}