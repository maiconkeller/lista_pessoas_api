package com.example.demo.config;

import com.example.demo.model.Pessoa;
import com.example.demo.model.Sexo;
import com.example.demo.repositories.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DataLoaderConfig implements ApplicationRunner {

    @Autowired
    private PessoaRepository pessoaRepository;

    @Override
    public void run(ApplicationArguments applicationArguments) throws Exception {

        this.criarPessoas();

    }

    private void criarPessoas() {

        if (pessoaRepository.count() == 0) {

            List<Pessoa> pessoas = new ArrayList<Pessoa>();
            pessoas.add(new Pessoa("Joao da Silva", Sexo.MASCULINO, 35));
            pessoas.add(new Pessoa("Maria da Silva", Sexo.FEMININO, 31));
            pessoas.add(new Pessoa("Joaquina Santos", Sexo.FEMININO, 22));
            pessoas.add(new Pessoa("Rodrigo de Souza", Sexo.MASCULINO, 34));

            pessoaRepository.save(pessoas);

        }

    }
}
