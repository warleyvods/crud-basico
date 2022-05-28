package com.warley.crudbasico.service;

import com.warley.crudbasico.entity.Pessoa;
import com.warley.crudbasico.exceptions.UsuarioNaoEncontradoException;
import com.warley.crudbasico.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {

    private final PessoaRepository pessoaRepository;

    public PessoaService(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    public Pessoa save(Pessoa pessoa) {
        return pessoaRepository.save(pessoa);
    }

    public Pessoa buscarUmaPessoa(Long id) {
        return pessoaRepository.findById(id).orElseThrow(UsuarioNaoEncontradoException::new);
    }

    public List<Pessoa> listarTodos() {
        return pessoaRepository.findAll();
    }

    public void deletarPessoa(Long id) {
        buscarUmaPessoa(id);
        pessoaRepository.deleteById(id);
    }

    public Pessoa buscarPorCpf(String cpf) {
        return pessoaRepository.findByCpf(cpf);
    }

}
