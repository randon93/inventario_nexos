package com.nexos.inventario.dto;

import com.nexos.inventario.entity.MercanciaEntity;
import com.nexos.inventario.entity.PersonaEntity;
import lombok.Data;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data
public class ActualizarMercanciaDto {

    private String id;
    private String fecha;
    private String objeto;

    private MercanciaDto mercanciaDto;

    private PersonaDto personaDto;
}
