package com.warley.crudbasico.controller.mappers;

import com.warley.crudbasico.controller.dtos.requests.PessoaRequestDTO;
import com.warley.crudbasico.controller.dtos.responses.PessoaResponseDTO;
import com.warley.crudbasico.entity.Pessoa;

import java.util.List;


public interface PessoaMapper {

    Pessoa paraEntity(PessoaRequestDTO pessoaRequestDTO);

    PessoaResponseDTO paraDto(Pessoa pessoa);

    List<PessoaResponseDTO> paraDtoList(List<Pessoa> pessoaList);

}
