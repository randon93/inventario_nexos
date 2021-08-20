package com.nexos.inventario.dto;

import lombok.Data;

import java.util.List;

@Data
public class PersonaDto {

    private String id;
    private String nombre;
    private CargoDto cargoDto;
    private List<MercanciaDto> mercanciaDtos;
    private List<ActualizarMercanciaDto> actualizarMercanciaDtos;

}
