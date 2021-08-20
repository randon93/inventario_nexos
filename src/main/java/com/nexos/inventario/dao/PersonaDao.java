package com.nexos.inventario.dao;

import com.nexos.inventario.entity.PersonaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaDao extends JpaRepository<PersonaEntity, String> {
}
