package com.sanket.springCRUD.service;

import com.sanket.springCRUD.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products = new ArrayList<>( Arrays.asList(
            new Product(101, "iPhone", 50000),
            new Product(102, "Acer Monitor", 20000),
            new Product(103, "HP Laptop", 80000)));

    public List<Product> getProducts(){
        return products;
    }

    public Product getProductById(int prodID) {
        return products.stream()
                .filter(p -> p.getProdID() == prodID)
                .findFirst().orElse(new Product(100, "No Item", 0));
    }

    public void addProduct(Product prod){
        products.add(prod);
    }
}
