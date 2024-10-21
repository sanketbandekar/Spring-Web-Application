package com.sanket.springCRUD.service;

import com.sanket.springCRUD.model.Product;
import com.sanket.springCRUD.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepo repo;

//    List<Product> products = new ArrayList<>( Arrays.asList(
//            new Product(101, "iPhone", 50000),
//            new Product(102, "Acer Monitor", 20000),
//            new Product(103, "HP Laptop", 80000)));

    public List<Product> getProducts(){
        return repo.findAll();
    }

    public Product getProductById(int prodID) {
        return  repo.findById(prodID).orElse(new Product(100,"Not Found",0));
    }

    public void addProduct(Product prod){
        repo.save(prod);
    }

    public void updateProduct(Product prod) {
        //add item not found logic
        repo.save(prod);
    }

    public void deleteProductById(int prodId) {
        //add item not found logic
        repo.deleteById(prodId);
    }
}
