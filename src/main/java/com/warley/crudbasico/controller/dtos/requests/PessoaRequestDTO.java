package com.warley.crudbasico.controller.dtos.requests;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class PessoaRequestDTO {

    @NotBlank
    private String nome;

    @NotBlank
    private String cpf;

    @NotNull
    private Integer idade;

    @NotBlank
    private String rg;

}
