package com.nexos.inventario.manejadores.cargo;

import com.nexos.inventario.convertidores.CargoResponseToCargoDto;
import com.nexos.inventario.convertidores.mapper.CargoMapper;
import com.nexos.inventario.dto.CargoDto;
import com.nexos.inventario.dto.CargoResponseDto;
import com.nexos.inventario.service.cargo.CrearCargoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CrearCargoManejador {

    @Autowired
    private CrearCargoService crearCargoService;

    @Autowired
    private CargoResponseToCargoDto cargoResponseToCargoDto;

    @Autowired
    private CargoMapper cargoMapper;

    public Long ejecutar(CargoResponseDto cargoResponseDto) {
        CargoDto cargoDto = cargoResponseToCargoDto.crear(cargoResponseDto);
        return crearCargoService.ejecutar(cargoMapper.cargoDtoToCargoEnity(cargoDto));
    }
}
