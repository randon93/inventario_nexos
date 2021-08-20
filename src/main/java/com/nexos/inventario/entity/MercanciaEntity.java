package com.nexos.inventario.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
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
    private String usuarioRegis;

    @OneToMany(mappedBy = "mercanciaEntity")
    private List<ActualizacionMercancia> actualizacionMercancias;
}
