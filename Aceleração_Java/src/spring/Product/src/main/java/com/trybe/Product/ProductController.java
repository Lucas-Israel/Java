package com.trybe.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Anotação especializada
@RestController
@RequestMapping("/product")
public class ProductController {
  private ProductService productService;

  @Autowired
  public ProductController(ProductService productRepository) {
    this.productService = productRepository;
  }

  // Novo método
  @GetMapping
  public String getMessage() {
    return productService.getMessage();
  }
}