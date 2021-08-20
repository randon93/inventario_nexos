package com.nexos.inventario.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "mercancia")
public class MercanciaEntity {

    @Id
    private String id;
    private String nombre;
    private String cantidad;
    private String fechaIngreso;

    @ManyToOne
    private PersonaEntity personaEntity;

    @OneToMany(mappedBy = "mercanciaEntity")
    private List<ActualizacionMercanciaEntity> actualizacionMercanciaEntities;
}
