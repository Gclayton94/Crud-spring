package com.desafiounigex.products.entity;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name= "tb_product")
@NoArgsConstructor
@Getter
@Setter
public class Product {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="id",nullable = false, unique = true)
    @Setter(AccessLevel.NONE)
    private Long id;

    @Column(name="nome",nullable = false)
    private  String nome;

    @Column(name="codigo",nullable = false, unique = true)
    private  String codigo;
    @Column(name="quantidade",nullable = false)
    private  Integer quantidade;

    @Builder
    public Product(String nome, String codigo, Integer quantidade) {
        this.nome = nome;
        this.codigo = codigo;
        this.quantidade = quantidade;
    }
}