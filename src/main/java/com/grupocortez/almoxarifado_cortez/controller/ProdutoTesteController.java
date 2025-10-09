package com.grupocortez.almoxarifado_cortez.controller;

import com.grupocortez.almoxarifado_cortez.model.ProdutoTeste;
import com.grupocortez.almoxarifado_cortez.service.ProdutoTesteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produto-teste")
public class ProdutoTesteController {

    @Autowired
    private ProdutoTesteService produtoTesteService;

    @PostMapping
    public ResponseEntity criarProduto(@RequestBody ProdutoTeste produto) {
        produtoTesteService.criarProduto(produto);

        return ResponseEntity.ok().body(produto);
    }
}
