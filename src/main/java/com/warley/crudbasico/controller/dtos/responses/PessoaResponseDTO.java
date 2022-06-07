package com.warley.crudbasico.controller.dtos.responses;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class PessoaResponseDTO {

    private Long id;
    private String nome;
    private String cpf;
    private Integer idade;
    private String rg;
    private LocalDateTime createdAt;

}
