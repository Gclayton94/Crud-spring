package com.desafiounigex.products.dto.response;


import com.desafiounigex.products.entity.Product;
import lombok.Getter;

@Getter
public class ProductResponseDTO {
    private Long id;

    private  String nome;


    private  String codigo;

    private  Integer quantidade;

    public ProductResponseDTO(Product product){
        this.id = product.getId();
        this.nome = product.getNome();
        this.codigo = product.getCodigo();
        this.quantidade = product.getQuantidade();
    }
}
