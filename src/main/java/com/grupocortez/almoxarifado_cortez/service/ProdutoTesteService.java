package com.grupocortez.almoxarifado_cortez.service;

import com.grupocortez.almoxarifado_cortez.model.ProdutoTeste;
import com.grupocortez.almoxarifado_cortez.repository.ProdutoTesteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class ProdutoTesteService {

    @Autowired
    private ProdutoTesteRepository produtoTesteRepo;

    public ProdutoTeste criarProduto(ProdutoTeste produto) {
       return produtoTesteRepo.save(produto);
    }

    public ProdutoTeste pesquisarProdutoPorId(Integer id) {
        return produtoTesteRepo.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Produto não encontrado"));
    }
}
