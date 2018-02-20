package com.example.demo.resources;

import com.example.demo.model.Pessoa;
import com.example.demo.services.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// http://localhost:8080/pessoas

@RestController
@RequestMapping("pessoas")
@CrossOrigin(origins = "*")
public class PessoaResource {

    @Autowired
    private PessoaService pessoaService;

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public List<Pessoa> all() {

        List<Pessoa> lista = pessoaService.findAll();
        return lista;

    }

}
