package com.example.nxttrendz2.repository;


import com.example.nxttrendz2.model.Product;
import com.example.nxttrendz2.model.Category;

import java.util.*;

public interface ProductRepository{
    ArrayList<Product> getProducts();
    Product getProductsById(int productId);
    Product addProduct(Product product);
    Product updateProduct(int productId,Product product);
    void deleteProduct(int productId);
    Category getProductCategory(int productId);
}