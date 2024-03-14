package com.roger.springbootmall.dao;

import com.roger.springbootmall.dto.ProductQueryParams;
import com.roger.springbootmall.dto.ProductRequest;
import com.roger.springbootmall.model.Product;
import com.roger.springbootmall.service.ProductService;

import java.util.List;

public interface ProductDao {

    List<Product> getProducts(ProductQueryParams productQueryParams);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);

}
