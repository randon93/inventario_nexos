package com.nexos.inventario.dto;

import lombok.Data;

import java.util.List;

@Data
public class MercanciaDto {

    private String id;
    private String nombre;
    private String cantidad;
    private String fechaIngreso;
    private PersonaDto personaEntity;
    private List<ActualizarMercanciaDto> actualizarMercanciaDtos;
}
