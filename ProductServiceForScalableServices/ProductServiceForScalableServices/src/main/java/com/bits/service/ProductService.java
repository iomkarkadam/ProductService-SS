package com.bits.service;

import com.bits.entity.Product;
import com.bits.model.ProductDTO;
import com.bits.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public void saveProduct(ProductDTO productDTO){
        Product product= new Product();
        product.setProductName(productDTO.getProductName());
        product.setProductPrice(productDTO.getProductPrice());
        productRepository.save(product);
    }
    public ProductDTO getProduct(Long productId){

        Optional<Product> optionalProduct= productRepository.findById(productId);
        Product product= optionalProduct.get();

        ProductDTO productDTO= new ProductDTO();
        productDTO.setProductName(product.getProductName());
        productDTO.setProductPrice(product.getProductPrice());
        return productDTO;
    }



}
