package com.nexos.inventario.dao;

import com.nexos.inventario.entity.MercanciaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActualizarMercanciaDao extends JpaRepository<MercanciaEntity, String> {
}
