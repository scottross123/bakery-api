package com.scottross123.bakeryapi.service;

import com.scottross123.bakeryapi.model.Product;
import com.scottross123.bakeryapi.model.Recipe;
import com.scottross123.bakeryapi.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    public Product getProduct(Long id) {
        Product product = productRepository.findById(id).orElseThrow(() -> new IllegalStateException("Product with id " + id + " does not exist!!"));
        return product;
    }

    public void addProduct(Product product) {
        productRepository.save(product);
    }

    public void deleteProduct(Long id) {
        Product product = productRepository.findById(id).orElseThrow(() -> new IllegalStateException("Product with id " + id + " does not exist!!"));
        productRepository.delete(product);
    }

    @Transactional
    public void updateProduct(Long id, Product updatedProduct) {
        Product product = productRepository.findById(id).orElseThrow(() -> new IllegalStateException("Product with id " + id + " does not exist!!"));
        product.setName(updatedProduct.getName());
        product.setDescription(updatedProduct.getDescription());
        product.setPrice(updatedProduct.getPrice());
        product.setRecipe(updatedProduct.getRecipe());
    }

    public Recipe getRecipe(Long id) {
        Product product = productRepository.findById(id).orElseThrow(() -> new IllegalStateException("Product with id " + id + " does not exist!!"));
        return product.getRecipe();
    }
}
