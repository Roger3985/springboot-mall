package com.roger.springbootmall.service;

import com.roger.springbootmall.constant.ProductCategory;
import com.roger.springbootmall.dto.ProductRequest;
import com.roger.springbootmall.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProducts(ProductCategory category, String search);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
