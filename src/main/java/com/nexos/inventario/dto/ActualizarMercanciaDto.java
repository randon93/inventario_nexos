package com.nexos.inventario.dto;

import lombok.Data;

@Data
public class ActualizarMercanciaDto {

    private Long id;
    private String fecha;
    private String objeto;

    private MercanciaDto mercancia;

    private PersonaDto persona;
}
