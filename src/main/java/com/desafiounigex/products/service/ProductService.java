package com.desafiounigex.products.service;


import com.desafiounigex.products.dto.request.ProductRequestDTO;
import com.desafiounigex.products.dto.response.ProductResponseDTO;

import java.util.List;

public interface ProductService {
    ProductResponseDTO findById(Long id);

List<ProductResponseDTO> findAll();

ProductResponseDTO register(ProductRequestDTO ProductDTO);
ProductResponseDTO update(ProductRequestDTO ProductDTO, Long id);
String delete(Long id);
}
