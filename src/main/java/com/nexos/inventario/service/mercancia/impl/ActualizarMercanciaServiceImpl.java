package com.nexos.inventario.service.mercancia.impl;

import com.nexos.inventario.convertidores.mapper.MercanciaMapper;
import com.nexos.inventario.dao.ActualizarMercanciaDao;
import com.nexos.inventario.dao.MercanciaDao;
import com.nexos.inventario.entity.ActualizarMercanciaEntity;
import com.nexos.inventario.entity.MercanciaEntity;
import com.nexos.inventario.entity.PersonaEntity;
import com.nexos.inventario.excepcion.ExcepcionDuplicidad;
import com.nexos.inventario.service.mercancia.ActualizarMercanciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Objects;

@Service
public class ActualizarMercanciaServiceImpl implements ActualizarMercanciaService {

    @Autowired
    private MercanciaDao mercanciaDao;

    @Autowired
    private ActualizarMercanciaDao actualizarMercanciaDao;

    @Autowired
    private MercanciaMapper mercanciaMapper;

    @Override
    public Long ejecutar(MercanciaEntity mercanciaEntity, PersonaEntity usuarioAct) {
        validarNombre(mercanciaEntity.getNombre());
        actualizar(mercanciaEntity, usuarioAct);
        return mercanciaDao.save(mercanciaEntity).getId();
    }

    private void validarNombre(String nombre) {
        MercanciaEntity mercanciaEntity = mercanciaDao.findByNombre(nombre).orElse(null);
        if (Objects.nonNull(mercanciaEntity)) {
            throw new ExcepcionDuplicidad("Mercancia '" + nombre + "' ya esta registrada.");
        }
    }


    private void actualizar(MercanciaEntity mercanciaDtoEntityNueva, PersonaEntity usuarioAct) {
        MercanciaEntity mercanciaEntityVieja = mercanciaDao.findById(mercanciaDtoEntityNueva.getId()).get();
        ActualizarMercanciaEntity entity = new ActualizarMercanciaEntity();
        entity.setFecha(LocalDateTime.now());
        entity.setMercancia(mercanciaEntityVieja);
        entity.setPersona(usuarioAct);
        entity.setObjetoViejo(mercanciaEntityVieja.toString());
        entity.setObjetoNuevo(mercanciaDtoEntityNueva.toString());
        entity.setId(mercanciaDtoEntityNueva.getId());
        actualizarMercanciaDao.save(entity);
    }
}
