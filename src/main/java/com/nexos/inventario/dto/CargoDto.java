package com.nexos.inventario.dto;

import lombok.Getter;

import java.util.List;

@Getter
public class CargoDto {

    private Long id;
    private String nombre;
    private List<PersonaDto> personas;

    public CargoDto(Long id, String nombre, List<PersonaDto> personas) {
        this.id = id;
        this.nombre = nombre;
        this.personas = personas;
    }
}
