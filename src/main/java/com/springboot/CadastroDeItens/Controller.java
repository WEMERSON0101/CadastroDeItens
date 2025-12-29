package com.springboot.CadastroDeItens;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping
public class Controller {
    
    @GetMapping("/home")
 
    public String home() {
        return "Bem-vindo ao Cadastro de Itens!";
    }

}
