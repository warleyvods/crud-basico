package com.warley.crudbasico.controller.dtos.responses;

import java.time.LocalDateTime;

public record PessoaResponseDTO(
        Long id,
        String nome,
        String cpf,
        Integer idade,
        String rg,
        LocalDateTime createdAt
) {

}
