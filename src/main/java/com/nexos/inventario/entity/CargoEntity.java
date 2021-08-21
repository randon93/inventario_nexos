package com.nexos.inventario.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.FetchType;
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

    @OneToMany(mappedBy = "cargo", fetch = FetchType.LAZY)
    private List<PersonaEntity> personas;
}
