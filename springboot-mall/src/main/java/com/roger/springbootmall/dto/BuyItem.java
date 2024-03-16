package com.roger.springbootmall.dto;

import org.springframework.lang.NonNull;

public class BuyItem {

    @NonNull
    private Integer productId;

    @NonNull
    private Integer quantity;

    @NonNull
    public Integer getProductId() {
        return productId;
    }

    public void setProductId(@NonNull Integer productId) {
        this.productId = productId;
    }

    @NonNull
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(@NonNull Integer quantity) {
        this.quantity = quantity;
    }
}
