package com.desafiounigex.products.service;

import com.desafiounigex.products.dto.request.ProductRequestDTO;
import com.desafiounigex.products.dto.response.ProductResponseDTO;
import com.desafiounigex.products.entity.Product;
import com.desafiounigex.products.repository.ProductRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public class ProductServiceImplement implements ProductService {

    private ProductRepository productRepository;
    @Override
    public ProductResponseDTO findById(Long id) {
    Product product= returnProduct(id);

    return new ProductResponseDTO(product);

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
    public ProductResponseDTO update(ProductRequestDTO ProductDTO, Long id) {
        Product product= returnProduct(id) ;
    }

    @Override
    public String delete(Long id) {
        return null;
    }
    private Product returnProduct(Long id){
        return ProductRepository.findById(id).orElseThrow(()-> new RuntimeException("Produto não encontrado"));

    }
}
