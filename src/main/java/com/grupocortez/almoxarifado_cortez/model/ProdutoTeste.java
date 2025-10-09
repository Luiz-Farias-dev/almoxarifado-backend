package com.grupocortez.almoxarifado_cortez.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "produto_teste")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProdutoTeste {
    @Id
    @GeneratedValue( strategy = GenerationType.UUID)
    private String id;

    @Column
    private String name;

    @Column
    private String descricao;
}
