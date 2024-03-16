package com.roger.springbootmall.service;

import com.roger.springbootmall.dto.CreateOrderRequest;
import com.roger.springbootmall.model.Order;

public interface OrderService {

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
