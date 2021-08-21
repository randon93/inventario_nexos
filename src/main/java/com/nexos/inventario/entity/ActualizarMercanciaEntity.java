package com.nexos.inventario.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "actualizar_mercancia")
public class ActualizarMercanciaEntity {

    @Id
    private Long id;
    private LocalDateTime fecha;
    private String objetoViejo;
    private String objetoNuevo;

    @ManyToOne
    @JoinColumn(name = "mercancia_id")
    @ToString.Exclude
    private MercanciaEntity mercancia;

    @ManyToOne
    @JoinColumn(name = "persona_id")
    @ToString.Exclude
    private PersonaEntity persona;

}
