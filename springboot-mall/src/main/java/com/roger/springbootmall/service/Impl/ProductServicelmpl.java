package com.roger.springbootmall.service.Impl;

import com.roger.springbootmall.dao.ProductDao;
import com.roger.springbootmall.dto.ProductRequest;
import com.roger.springbootmall.model.Product;
import com.roger.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServicelmpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }

    public Integer createProduct(ProductRequest productRequest) {
        return productDao.createProduct(productRequest);
    }
}
