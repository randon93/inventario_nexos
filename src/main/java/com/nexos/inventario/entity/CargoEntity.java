package com.nexos.inventario.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Data
@Table(name = "cargo")
public class CargoEntity {

    @Id
    private Long id;
    private String nombre;

    @OneToMany(mappedBy = "cargoEntity")
    private List<PersonaEntity> personaEntities;
}
