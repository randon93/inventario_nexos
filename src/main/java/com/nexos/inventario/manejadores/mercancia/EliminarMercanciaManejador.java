package com.nexos.inventario.manejadores.mercancia;

import com.nexos.inventario.convertidores.mapper.MercanciaMapper;
import com.nexos.inventario.dao.MercanciaDao;
import com.nexos.inventario.dto.EliminarMercanciaDto;
import com.nexos.inventario.entity.MercanciaEntity;
import com.nexos.inventario.service.mercancia.EliminarMercanciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EliminarMercanciaManejador {
    @Autowired
    private MercanciaDao mercanciaDao;

    @Autowired
    private MercanciaMapper mercanciaMapper;

    @Autowired
    private EliminarMercanciaService eliminarMercanciaService;

    public void ejecutar(EliminarMercanciaDto eliminarMercanciaDto) {
        MercanciaEntity mercanciaEntity = mercanciaDao.findById(eliminarMercanciaDto.getMercancia()).get();
        eliminarMercanciaService.ejecutar(mercanciaEntity, eliminarMercanciaDto.getUsuario());
    }
}
