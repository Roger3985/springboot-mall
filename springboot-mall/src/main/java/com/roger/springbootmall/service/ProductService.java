package com.roger.springbootmall.service;

import com.roger.springbootmall.dto.ProductRequest;
import com.roger.springbootmall.model.Product;

public interface ProductService {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
