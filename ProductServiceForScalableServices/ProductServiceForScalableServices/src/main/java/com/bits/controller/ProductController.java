package com.bits.controller;

import com.bits.model.ProductDTO;
import com.bits.repo.ProductRepository;
import com.bits.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping
    public String saveProduct( @RequestBody  ProductDTO productDTO){
        productService.saveProduct(productDTO);
        return "successfully saved";
    }

    @GetMapping
    public String getProduct( @PathVariable  Long productId){
        productService.getProduct(productId);
        return "successfully saved";
    }
}
