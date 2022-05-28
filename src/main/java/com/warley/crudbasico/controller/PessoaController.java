package com.warley.crudbasico.controller;

import com.warley.crudbasico.controller.dtos.requests.PessoaRequestDTO;
import com.warley.crudbasico.controller.dtos.responses.PessoaResponseDTO;
import com.warley.crudbasico.controller.mappers.PessoaMapper;
import com.warley.crudbasico.entity.Pessoa;
import com.warley.crudbasico.service.PessoaService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class PessoaController {

    private final PessoaService pessoaService;
    private final PessoaMapper pessoaMapper;

    public PessoaController(PessoaService pessoaService, PessoaMapper pessoaMapper) {
        this.pessoaService = pessoaService;
        this.pessoaMapper = pessoaMapper;
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/pessoa/salvar")
    public PessoaResponseDTO salvarPessoa(@RequestBody @Valid PessoaRequestDTO pessoaRequestDTO) {
        Pessoa pessoa = pessoaMapper.paraEntity(pessoaRequestDTO);
        return pessoaMapper.paraDto(pessoaService.save(pessoa));
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/pessoa/{id}")
    public PessoaResponseDTO buscarUm(@PathVariable Long id) {
        return pessoaMapper.paraDto(pessoaService.buscarUmaPessoa(id));
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/pessoa/listar")
    public List<PessoaResponseDTO> listar() {
        return pessoaMapper.paraDtoList(pessoaService.listarTodos());
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/pessoa/deletar/{id}")
    public void deletarPorId(@PathVariable Long id) {
        pessoaService.deletarPessoa(id);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/pessoa/cpf/{cpf}")
    public PessoaResponseDTO buscarUm(@PathVariable String cpf) {
        return pessoaMapper.paraDto(pessoaService.buscarPorCpf(cpf));
    }

}
