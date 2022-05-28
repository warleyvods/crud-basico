package com.warley.crudbasico.exceptions.handler;

import com.warley.crudbasico.exceptions.UsuarioNaoEncontradoException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class RestExceptionHandler {

    @ExceptionHandler(UsuarioNaoEncontradoException.class)
    public ExceptionFilters jogarExcecao(UsuarioNaoEncontradoException ex) {
        return ExceptionFilters.builder()
                .status(HttpStatus.NOT_FOUND.value())
                .titulo("Usuario nao encontrado!")
                .build();
    }
}
