package com.roger.springbootmall.service;

import com.roger.springbootmall.dto.CreateOrderRequest;
import com.roger.springbootmall.dto.OrderQueryParams;
import com.roger.springbootmall.model.Order;

import java.util.List;

public interface OrderService {

    Integer countOrders(OrderQueryParams orderQueryParams);

    List<Order> getOrders(OrderQueryParams orderQueryParams);

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
