package com.desafiounigex.products.util;

import com.desafiounigex.products.dto.request.ProductRequestDTO;
import com.desafiounigex.products.dto.response.ProductResponseDTO;
import com.desafiounigex.products.entity.Product;

import java.util.List;
import java.util.stream.Collectors;

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

    public  List<ProductResponseDTO> toProductDTO(List<Product> productList){
        return productList.stream().map(ProductResponseDTO::new).collect(Collectors.toList());
    }
    public void updateProductData(Product product, ProductRequestDTO productDTO){
        product.setNome(productDTO.getNome());
        product.setCodigo(productDTO.getCodigo());
        product.setQuantidade(product.getQuantidade());

    }
}
