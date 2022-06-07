package com.warley.crudbasico.controller.mappers;

import com.warley.crudbasico.controller.dtos.requests.PessoaRequestDTO;
import com.warley.crudbasico.controller.dtos.responses.PessoaResponseDTO;
import com.warley.crudbasico.entity.Pessoa;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PessoaMapperImpl implements PessoaMapper {

    @Override
    public Pessoa paraEntity(PessoaRequestDTO pessoaRequestDTO) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome(pessoaRequestDTO.getNome());
        pessoa.setCpf(pessoaRequestDTO.getCpf());
        pessoa.setIdade(pessoaRequestDTO.getIdade());
        pessoa.setRg(pessoaRequestDTO.getRg());

        return pessoa;
    }

    @Override
    public PessoaResponseDTO paraDto(Pessoa pessoa) {
        return new PessoaResponseDTO(pessoa.getId(), pessoa.getNome(), pessoa.getCpf(), pessoa.getIdade(), pessoa.getRg(), pessoa.getCreatedAt());
    }

    @Override
    public List<PessoaResponseDTO> paraDtoList(List<Pessoa> pessoaList) {

        List<PessoaResponseDTO> pessoaResponseDTOS = new ArrayList<>();
        for (Pessoa pessoa : pessoaList) {
            pessoaResponseDTOS.add(paraDto(pessoa));
        }

        return pessoaResponseDTOS;
    }

}
