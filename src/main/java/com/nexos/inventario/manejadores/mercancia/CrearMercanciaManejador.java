package com.nexos.inventario.manejadores.mercancia;

import com.nexos.inventario.convertidores.mapper.MercanciaMapper;
import com.nexos.inventario.dto.MercanciaDto;
import com.nexos.inventario.dto.MercanciaResponseDto;
import com.nexos.inventario.convertidores.MercanciaResponseToMercanciaDtoConvertidor;
import com.nexos.inventario.entity.MercanciaEntity;
import com.nexos.inventario.service.mercancia.CrearMercanciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CrearMercanciaManejador {

    @Autowired
    private MercanciaResponseToMercanciaDtoConvertidor fabri;

    @Autowired
    private CrearMercanciaService crearMercanciaService;

    @Autowired
    private MercanciaMapper mercanciaMapper;


    public Long ejecutar(MercanciaResponseDto mercanciaResponseDto) {

        MercanciaDto mercanciaDto = fabri.crear(mercanciaResponseDto);
        MercanciaEntity mercanciaEntity = mercanciaMapper.toMercanciaEntity(mercanciaDto);
        return crearMercanciaService.ejecutar(mercanciaEntity);

    }


}
