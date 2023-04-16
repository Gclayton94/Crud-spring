package com.desafiounigex.products.service;

import com.desafiounigex.products.dto.request.ProductRequestDTO;
import com.desafiounigex.products.dto.response.ProductResponseDTO;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public class ProductServiceImplement implements ProductService {
    @Override
    public ProductResponseDTO findById(Long id) {
        return null;
    }

    @Override
    public List<ProductResponseDTO> findAll() {
        return null;
    }

    @Override
    public ProductResponseDTO register(ProductRequestDTO ProductDTO) {
        return null;
    }

    @Override
    public ProductResponseDTO update(ProductRequestDTO ProductDTO) {
        return null;
    }

    @Override
    public String delete(Long id) {
        return null;
    }
}
