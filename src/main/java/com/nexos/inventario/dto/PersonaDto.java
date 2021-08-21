package com.nexos.inventario.dto;

import lombok.Data;

import java.util.List;

@Data
public class PersonaDto {

    private Long id;
    private String nombre;
    private CargoDto cargoDto;
    private List<MercanciaDto> mercancias;
    private List<ActualizarMercanciaDto> actualizarMercancias;

}
