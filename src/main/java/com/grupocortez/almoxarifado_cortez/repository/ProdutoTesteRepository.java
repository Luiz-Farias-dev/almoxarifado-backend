package com.grupocortez.almoxarifado_cortez.repository;

import com.grupocortez.almoxarifado_cortez.model.ProdutoTeste;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoTesteRepository extends JpaRepository<ProdutoTeste, Integer> {
}
