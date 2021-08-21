package com.nexos.inventario.convertidores;

import com.nexos.inventario.dto.MercanciaResponseDto;
import com.nexos.inventario.entity.MercanciaEntity;
import org.springframework.stereotype.Component;

@Component
public class MercanciaEntityToMercanciaResponseConvertidos {

    public MercanciaResponseDto crear(MercanciaEntity mercanciaEntity) {
        return  MercanciaResponseDto.builder()
                .id(mercanciaEntity.getId())
                .cantidad(mercanciaEntity.getCantidad())
                .fechaIngreso(mercanciaEntity.getFechaIngreso())
                .nombre(mercanciaEntity.getNombre())
                .persona(mercanciaEntity.getPersona().getId())
                .build();
    }
}
