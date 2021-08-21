package com.nexos.inventario.convertidores;

import com.nexos.inventario.convertidores.mapper.PersonaMapper;
import com.nexos.inventario.dao.PersonaDao;
import com.nexos.inventario.dto.MercanciaDto;
import com.nexos.inventario.dto.MercanciaResponseDto;
import com.nexos.inventario.dto.PersonaDto;
import com.nexos.inventario.entity.PersonaEntity;
import com.nexos.inventario.excepcion.ExcepcionSinDatos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MercanciaResponseToMercanciaDtoConvertidor {

    @Autowired
    private PersonaDao personaDao;

    @Autowired
    private PersonaMapper personaMapper;

    public MercanciaDto crear(MercanciaResponseDto mercanciaResponseDto) {

        PersonaEntity personaEntity = personaDao.findById(mercanciaResponseDto.getPersona()).orElseThrow(
                () -> new ExcepcionSinDatos("No existe la persona")
        );
        PersonaDto personaDto = personaMapper.toPersonaDto(personaEntity);

        return new MercanciaDto(
                mercanciaResponseDto.getId(),
                mercanciaResponseDto.getNombre(),
                mercanciaResponseDto.getCantidad(),
                mercanciaResponseDto.getFechaIngreso(),
                personaDto
        );
    }
}
