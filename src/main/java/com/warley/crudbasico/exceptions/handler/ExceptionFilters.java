package com.warley.crudbasico.exceptions.handler;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ExceptionFilters {

    private String titulo;
    private Integer status;

}
