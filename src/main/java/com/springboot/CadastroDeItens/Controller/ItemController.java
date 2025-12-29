package com.springboot.CadastroDeItens.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping
public class ItemController {

    @GetMapping("/home")

    public String home() {
        return "Bem-vindo ao Cadastro de Itens!";
    }

}
