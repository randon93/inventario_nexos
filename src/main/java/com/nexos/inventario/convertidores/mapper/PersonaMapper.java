package com.nexos.inventario.convertidores.mapper;

import com.nexos.inventario.dto.PersonaDto;
import com.nexos.inventario.entity.PersonaEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper( componentModel = "spring")
public interface PersonaMapper {

    PersonaMapper INSTANCIA = Mappers.getMapper(PersonaMapper.class);

    PersonaEntity toPersonaEntity(PersonaDto personaDto);

    PersonaDto toPersonaDto(PersonaEntity personaEntity);

}
