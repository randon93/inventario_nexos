package com.nexos.inventario.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
public class MercanciaResponseDto {

    private Long id;
    private String nombre;
    private String cantidad;
    private LocalDateTime fechaIngreso;
    private Long persona;
}
