package dev.ak.inventoryManager.service;

import dev.ak.inventoryManager.entity.Product;

import java.util.List;

public interface ProductCRUDService {

    Product createProduct(Product product);
    List<Product> getAllProducts ();
    Product getProduct (long id);
    void deleteProduct(long id);
    Product updateProduct(long id,Product product);


}
