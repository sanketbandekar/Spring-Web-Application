package com.sanket.springCRUD.service;

import com.sanket.springCRUD.model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products = Arrays.asList(
            new Product(101, "iPhone", 50000),
            new Product(102, "Acer Monitor", 20000),
            new Product(103, "HP Laptop", 80000));

    public List<Product> getProducts(){
        return products;
    }
}
