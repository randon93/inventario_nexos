package com.nexos.inventario.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "persona")
public class PersonaEntity {

    @Id
    private String id;
    private String nombre;

    @ManyToOne
    private CargoEntity cargoEntity;

    @OneToMany(mappedBy = "personaEntity")
    private List<ActualizacionMercancia> actualizacionMercancias;
}
