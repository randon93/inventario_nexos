package com.nexos.inventario.convertidores.mapper;

import com.nexos.inventario.dto.CargoDto;
import com.nexos.inventario.entity.CargoEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CargoMapper {

    CargoMapper INSTANCIA = Mappers.getMapper(CargoMapper.class);

    CargoDto cargoEntityToCargoDto(CargoEntity cargoEntity);

    CargoEntity cargoDtoToCargoEnity(CargoDto cargoDto);


    List<CargoDto> cargoEntityToCargoDto(List<CargoEntity> cargoEntity);

    List<CargoEntity> cargoDtoToCargoEnity(List<CargoDto> aulaDto);
}
