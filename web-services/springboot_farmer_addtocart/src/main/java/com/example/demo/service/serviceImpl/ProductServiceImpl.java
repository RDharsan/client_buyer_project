package com.example.demo.service.serviceImpl;


import com.example.demo.dto.*;

import com.example.demo.enums.*;
import com.example.demo.exception.*;

import com.example.demo.model.*;
import com.example.demo.repository.*;
import com.example.demo.service.*;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements Product_Service {

    @Autowired
    private Product_Repository productRepository;

    @Autowired
    private DozerBeanMapper dozerBeanMapper;

    @Override
    public String addProduct(ProductDTO dto) {
        Product_model product = dozerBeanMapper.map(dto, Product_model.class);
        productRepository.save(product);
        return "SUCCESS";
    }

    @Override
    public String uploadProducts(List<ProductDTO> dtos) throws Conflict_Exception {
        for (ProductDTO dto: dtos) {
            try{
                Product_model product = dozerBeanMapper.map(dto, Product_model.class);
                productRepository.save(product);
            }
            catch (DataIntegrityViolationException e){
                throw new Conflict_Exception("Duplicate Product Barcode");
            }
        };
        return "SUCCESS";
    }

    @Override
    public ProductDTO findProductById(Long productId) {

        Product_model product = productRepository.findOne(productId);

        ProductDTO productDTO = dozerBeanMapper.map(product, ProductDTO.class);

        return productDTO;
    }

    @Override
    public List<ProductDTO> retrieveProducts() {

        List<Product_model> products = productRepository.findAll();

        List<ProductDTO> productDTOS = new ArrayList<>();

        for (Product_model product: products) {
            productDTOS.add(dozerBeanMapper.map(product, ProductDTO.class));
        }

        return productDTOS;
    }

    @Override
    public String updateProduct(ProductDTO dto, Long productId) throws DataNotFound_Exception {

        Product_model product = productRepository.findOne(productId);

        if(product != null) {
            product.setproductCost_p(dto.getproductCost_pro());
            product.setBarcode(dto.getbarcode_pro());
            product.setCategory(Category.valueOf(dto.getcategory_pro()));
            product.setproductCost_p(dto.getproductCost_pro());
         //   product.setProductImage(dto.getProductImage());
            product.setproductDescription_p(dto.getproductDescription_pro());
            product.setproductSpecification_p(dto.getproductSpecification_pro());
            productRepository.flush();

            return "SUCCESS";
        } else {
            throw new DataNotFound_Exception("Product Not Found");
        }
    }

    @Override
    public String deleteProduct(Long productId) throws DataNotFound_Exception {

        Product_model product = productRepository.findOne(productId);

        if(product != null){
            productRepository.delete(product);
            return "SUCCESS";
        } else {
            throw  new DataNotFound_Exception("Product Not Found");
        }



    }
}