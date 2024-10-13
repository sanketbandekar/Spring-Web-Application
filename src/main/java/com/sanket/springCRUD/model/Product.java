package com.sanket.springCRUD.model;

public class Product {
    private int prodID;
    private String prodName;
    private int price;

    @Override
    public String toString() {
        return "Product{" +
                "prodID=" + prodID +
                ", prodName='" + prodName + '\'' +
                ", price=" + price +
                '}';
    }

    public Product(int prodID, String prodName, int price) {
        this.prodID = prodID;
        this.prodName = prodName;
        this.price = price;
    }

    public int getProdID() {
        return prodID;
    }

    public void setProdID(int prodID) {
        this.prodID = prodID;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
