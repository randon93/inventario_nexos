package com.nexos.inventario.service.mercancia.impl;

import com.nexos.inventario.dao.MercanciaDao;
import com.nexos.inventario.entity.MercanciaEntity;
import com.nexos.inventario.excepcion.ExcepcionValorInvalido;
import com.nexos.inventario.service.mercancia.EliminarMercanciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class EliminarMercanciaServiceImpl implements EliminarMercanciaService {

    @Autowired
    private MercanciaDao mercanciaDao;

    @Override
    public void ejecutar(MercanciaEntity mercancia, Long user) {

        if (!Objects.equals(mercancia.getPersona().getId(), user)) {
            throw new ExcepcionValorInvalido("No se puede eliminar la mercancia");
        }
        mercanciaDao.delete(mercancia);

    }
}
