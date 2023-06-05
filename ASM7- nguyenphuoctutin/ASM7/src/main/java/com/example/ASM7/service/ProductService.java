package com.example.ASM7.service;

import com.example.ASM7.model.Product;
import com.example.ASM7.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> GetAll() {
        return productRepository.findAll();
    }

    public void add(Product newProduct) {
        productRepository.save(newProduct);
    }

    public Product get(int id) {
        return productRepository.findById(id).orElse(null);
    }

    public void edit(Product editProduct) {
        Product existingProduct = get(editProduct.getId());
        if (existingProduct != null) {
            existingProduct.setName(editProduct.getName());
            existingProduct.setImage(editProduct.getImage());
            existingProduct.setPrice(editProduct.getPrice());
            productRepository.save(existingProduct);
        }
    }
    public void delete(int id) {
        Product existingProduct = get(id);
        if (existingProduct != null) {
            productRepository.delete(existingProduct);
        }
    }
}
