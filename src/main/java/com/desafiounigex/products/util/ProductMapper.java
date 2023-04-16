package com.desafiounigex.products.util;

import com.desafiounigex.products.dto.request.ProductRequestDTO;
import com.desafiounigex.products.dto.response.ProductResponseDTO;
import com.desafiounigex.products.entity.Product;

public class ProductMapper {
    public Product toProduct(ProductRequestDTO productDTO){

       return Product.builder()
               .nome(productDTO.getNome())
               .codigo(productDTO.getCodigo())
               .quantidade(productDTO.getQuantidade())
               .build();
    }

    public ProductResponseDTO toProductDTO(Product product) {
        return  new ProductResponseDTO(product);
    }
}
