package com.nexos.inventario.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@Table(name = "mercancia")
public class MercanciaEntity {

    @Id
    private Long id;
    private String nombre;
    private String cantidad;
    private LocalDateTime fechaIngreso;

    @ManyToOne(fetch = FetchType.LAZY)
    @ToString.Exclude
    private PersonaEntity persona;

    @OneToMany(mappedBy = "mercancia", fetch = FetchType.LAZY)
    private List<ActualizarMercanciaEntity> actualizacionMercancias;
}
