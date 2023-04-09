package com.example.project48;

public class Cart {

    private String quantity;
    private String product;

    public Cart(String quantity, String product) {
        this.quantity = quantity;
        this.product = product;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }
}
