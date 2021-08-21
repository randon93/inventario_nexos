package com.nexos.inventario.dao;

import com.nexos.inventario.entity.CargoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.stream.Stream;

@Repository
public interface CargoDao extends JpaRepository<CargoEntity, Long> {

    Optional<CargoEntity> findByNombre(String nombre);

}
