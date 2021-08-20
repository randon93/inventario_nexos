package com.nexos.inventario.dao;

import com.nexos.inventario.entity.CargoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CargoDao extends JpaRepository<CargoEntity, String> {

    Optional<CargoEntity> findByNombre(String nombre);
}
