package com.example.demo.services;

import com.example.demo.model.Pessoa;
import com.example.demo.repositories.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public List<Pessoa> findAll() {

        return pessoaRepository.findAll();

    }

}
