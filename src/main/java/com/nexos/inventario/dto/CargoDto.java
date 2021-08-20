package com.nexos.inventario.dto;

import com.nexos.inventario.entity.PersonaEntity;
import lombok.Data;

import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Data
public class CargoDto {

    private Long id;
    private String nombre;
    private List<PersonaDto> personaDtos;
}
