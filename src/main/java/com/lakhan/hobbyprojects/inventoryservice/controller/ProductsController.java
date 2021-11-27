package com.lakhan.hobbyprojects.inventoryservice.controller;

import com.lakhan.hobbyprojects.inventoryservice.models.Product;
import com.lakhan.hobbyprojects.inventoryservice.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api/inventory")
@RestController
public class ProductsController {
    @Autowired
    private ProductsRepository repository;
    @GetMapping("/products")
    List<Product>  getAllProducts() {
        return repository.findAll();
    }
}
