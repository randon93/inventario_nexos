package com.nexos.inventario.convertidores.mapper;

import com.nexos.inventario.dto.MercanciaDto;
import com.nexos.inventario.entity.MercanciaEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.stream.Stream;

@Mapper( componentModel = "spring")
public interface MercanciaMapper {

    MercanciaMapper INSTANCIA = Mappers.getMapper(MercanciaMapper.class);

    MercanciaDto toMercanciaDto(MercanciaEntity mercanciaEntity);

    Stream<MercanciaDto> toStreamMercanciaDto(Stream<MercanciaEntity> mercanciaEntity);

    MercanciaEntity toMercanciaEntity(MercanciaDto mercanciaDto);

    Stream<MercanciaEntity> toMercanciaEntity(Stream<MercanciaDto> mercanciaDto);
}
