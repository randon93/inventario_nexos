package com.nexos.inventario.dao;

import com.nexos.inventario.entity.MercanciaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MercanciaDao extends JpaRepository<MercanciaEntity, Long> {

    Optional<MercanciaEntity> findByNombre(String nombre);
}
