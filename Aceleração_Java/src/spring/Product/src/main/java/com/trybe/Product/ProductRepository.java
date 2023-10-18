package com.trybe.Product;

import org.springframework.stereotype.Repository;

// Anotação especializada
@Repository
public class ProductRepository {

  // Novo método
  public String getMessage() {
    return "Mensagem: produto retornado";
  }
}
