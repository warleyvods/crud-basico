package com.warley.crudbasico.controller.dtos.requests;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public record PessoaRequestDTO(

        @NotBlank
        String nome,

        @NotBlank
        String cpf,

        @NotNull
        Integer idade,

        @NotBlank
        String rg
) {

}
