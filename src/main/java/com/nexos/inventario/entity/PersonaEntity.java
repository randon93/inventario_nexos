package com.nexos.inventario.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "persona")
public class PersonaEntity {

    @Id
    private Long id;
    private String nombre;


    @ManyToOne
    @ToString.Exclude
    private CargoEntity cargo;

    @OneToMany(mappedBy = "persona", fetch = FetchType.LAZY)
    private List<MercanciaEntity> mercancias;

    @OneToMany(mappedBy = "persona", fetch = FetchType.LAZY)
    private List<ActualizarMercanciaEntity> actualizacionMercancias;
}
