package com.desafiounigex.products.service;

import com.desafiounigex.products.dto.request.ProductRequestDTO;
import com.desafiounigex.products.dto.response.ProductResponseDTO;
import com.desafiounigex.products.entity.Product;
import com.desafiounigex.products.repository.ProductRepository;
import com.desafiounigex.products.util.ProductMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
@RequiredArgsConstructor
public class ProductServiceImplement implements ProductService {

    private final ProductRepository productRepository;
    private final ProductMapper productMapper;
    @Override
    public ProductResponseDTO findById(Long id) {
        return productMapper.toProductDTO(returnProduct(id));

    }

    @Override
    public List<ProductResponseDTO> findAll() {
        return productMapper.toProductDTO(productRepository.findAll());
    }

    @Override
    public ProductResponseDTO register(ProductRequestDTO ProductDTO) {
        Product product = productMapper.toProduct(ProductDTO);
        return productMapper.toProductDTO(productRepository.save(product));
    }

    @Override
    public ProductResponseDTO update(Long id,ProductRequestDTO ProductDTO) {
        Product product= returnProduct(id);
        productMapper.updateProductData(product,ProductDTO);
        return productMapper.toProductDTO(productRepository.save(product));
    }

    @Override
    public String delete(Long id) {
        productRepository.deleteById(id);
        return "Produto id:"+id+" deletado";
    }
    private Product returnProduct(Long id){
        return ProductRepository.findById(id).orElseThrow(()-> new RuntimeException("Produto não encontrado"));

    }
}
