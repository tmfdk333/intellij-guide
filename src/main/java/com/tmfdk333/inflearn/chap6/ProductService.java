package com.tmfdk333.inflearn.chap6;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Transactional
    public Long register(long amount, String name) {
        Product product = new Product(amount, name);
        Product savedProduct = productRepository.save(product);
        return savedProduct.getId();
    }

    @Transactional(readOnly = true)
    public Product findByName(String name){
        return productRepository.findByName(name)
                .orElseThrow(() -> new IllegalArgumentException(name+ "제품은 없습니다."));
    }
}
