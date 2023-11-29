package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.ProductDTO;
import com.example.demo.dto.SuccessResponseDTO;
import com.example.demo.exception.*;
import com.example.demo.service.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/products")
@Api("Product  Operation")
public class Products_Controller {

    @Autowired
    private Product_Service product_Service;


    @ApiOperation(value = "Add product", notes = "This api is used to save a product", httpMethod = "POST")
    @ApiResponses(value = { @ApiResponse(code = 500, message = "Internal Server error"),
            @ApiResponse(code = 401, message = "UnAuthorized") })
    @PostMapping(value = "/product", consumes = "application/json", produces = "application/json")
    public ResponseEntity<?> addProduct(@RequestBody ProductDTO dto) {
        return new ResponseEntity<SuccessResponseDTO>(new SuccessResponseDTO(product_Service.addProduct(dto)), HttpStatus.CREATED);
    }

    @ApiOperation(value = "Add products", notes = "This api is used to save multiple products", httpMethod = "POST")
    @ApiResponses(value = { @ApiResponse(code = 500, message = "Internal Server error"),
            @ApiResponse(code = 401, message = "UnAuthorized") })
    @PostMapping(consumes = "application/json", produces = "application/json")
    public ResponseEntity<?> addMultipleProducts(@RequestBody List<ProductDTO> products) throws Conflict_Exception {

        return  new ResponseEntity<SuccessResponseDTO>(new SuccessResponseDTO(product_Service.uploadProducts(products)), HttpStatus.CREATED);

    }

    @ApiOperation(value = "Get All Products", notes = "this api is used to retreive all products", httpMethod = "GET")
    @ApiResponses(value = { @ApiResponse(code = 500, message = "Internal Server error"),
            @ApiResponse(code = 401, message = "UnAuthorized") })
    @GetMapping(produces = "application/json")
    public  ResponseEntity<?> getProducts() {
        return new ResponseEntity<List<ProductDTO>>(product_Service.retrieveProducts(), HttpStatus.OK);
    }

    @ApiOperation(value = "Get product", notes = "this api is used to retreive product by Id", httpMethod = "GET")
    @ApiResponses(value = { @ApiResponse(code = 500, message = "Internal Server error"),
            @ApiResponse(code = 401, message = "UnAuthorized") })
    @GetMapping(value = "/product/{productId}", produces = "application/json")
    public ResponseEntity<?> getProduct(@PathVariable Long productId) {
        return new ResponseEntity<ProductDTO>(product_Service.findProductById(productId), HttpStatus.OK);
    }

    @ApiOperation(value = "Update product", notes = "this api is used to update the product by id", httpMethod = "PUT")
    @ApiResponses(value = { @ApiResponse(code = 500, message = "Internal Server error"),
            @ApiResponse(code = 401, message = "UnAuthorized") })
    @PutMapping(value = "/product/{productId}", consumes = "application/json", produces = "application/json")
    public ResponseEntity<?> updateProduct(@RequestBody ProductDTO dto, @PathVariable Long productId) throws DataNotFound_Exception {
        return new ResponseEntity<SuccessResponseDTO>(new SuccessResponseDTO(product_Service.updateProduct(dto, productId)), HttpStatus.ACCEPTED);
    }


    @ApiOperation(value = "Delete product", notes = "this api is used to delete the product by Id", httpMethod = "DELETE")
    @ApiResponses(value = { @ApiResponse(code = 500, message = "Internal Server error"),
            @ApiResponse(code = 401, message = "UnAuthorized") })
    @DeleteMapping(value = "/product/{productId}", produces = "application/json")
    public ResponseEntity<?> deleteProduct(@PathVariable Long productId) throws DataNotFound_Exception {
        return new ResponseEntity<SuccessResponseDTO>(new SuccessResponseDTO(product_Service.deleteProduct(productId)), HttpStatus.OK);
    }







}