package com.nexos.inventario.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "actualizar_mercancia")
public class ActualizacionMercancia {

    @Id
    private String id;
    private String fecha;

    @ManyToOne
    @JoinColumn(name = "mercancia_id")
    private MercanciaEntity mercanciaEntity;

    @ManyToOne
    @JoinColumn(name = "persona_id")
    private PersonaEntity personaEntity;

}
