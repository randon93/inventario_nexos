package com.nexos.inventario.service.mercancia.impl;

import com.nexos.inventario.convertidores.mapper.MercanciaMapper;
import com.nexos.inventario.dao.MercanciaDao;
import com.nexos.inventario.dto.MercanciaDto;
import com.nexos.inventario.entity.MercanciaEntity;
import com.nexos.inventario.excepcion.ExcepcionDuplicidad;
import com.nexos.inventario.service.mercancia.CrearMercanciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class CrearMercanciaServiceImpl implements CrearMercanciaService {

    @Autowired
    private MercanciaDao mercanciaDao;

    @Autowired
    private MercanciaMapper mercanciaMapper;

    @Override
    public Long ejecutar(MercanciaEntity mercanciaEntity) {
        validarNombre(mercanciaEntity.getNombre());
        return mercanciaDao.save(mercanciaEntity).getId();
    }

    private void validarNombre(String nombre) {
        MercanciaEntity mercanciaEntity = mercanciaDao.findByNombre(nombre).orElse(null);
        if (Objects.nonNull(mercanciaEntity)) {
            throw new ExcepcionDuplicidad("Mercancia '" + nombre + "' ya esta registrada.");
        }
    }

}
