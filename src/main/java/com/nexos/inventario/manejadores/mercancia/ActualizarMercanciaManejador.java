package com.nexos.inventario.manejadores.mercancia;

import com.nexos.inventario.convertidores.MercanciaResponseToMercanciaDtoConvertidor;
import com.nexos.inventario.convertidores.mapper.MercanciaMapper;
import com.nexos.inventario.dao.PersonaDao;
import com.nexos.inventario.dto.MercanciaDto;
import com.nexos.inventario.dto.MercanciaResponseDto;
import com.nexos.inventario.entity.MercanciaEntity;
import com.nexos.inventario.entity.PersonaEntity;
import com.nexos.inventario.service.mercancia.ActualizarMercanciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ActualizarMercanciaManejador {

    @Autowired
    private MercanciaResponseToMercanciaDtoConvertidor fabri;

    @Autowired
    private ActualizarMercanciaService actualizarMercanciaService;

    @Autowired
    private MercanciaMapper mercanciaMapper;

    @Autowired
    private PersonaDao personaDao;

    public Long ejecutar(MercanciaResponseDto mercanciaResponseDto) {

        MercanciaDto mercanciaDto = fabri.crear(mercanciaResponseDto);
        MercanciaEntity mercanciaEntity = mercanciaMapper.toMercanciaEntity(mercanciaDto);
        PersonaEntity personaEntity = personaDao.findById(mercanciaResponseDto.getPersona()).get();
        return actualizarMercanciaService.ejecutar(mercanciaEntity, personaEntity);

    }
}
