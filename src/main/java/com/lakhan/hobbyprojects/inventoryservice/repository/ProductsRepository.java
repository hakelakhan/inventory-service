package com.lakhan.hobbyprojects.inventoryservice.repository;

import com.lakhan.hobbyprojects.inventoryservice.models.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductsRepository extends MongoRepository<Product, Long> {

}
