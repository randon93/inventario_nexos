package com.nexos.inventario.convertidores;

import com.nexos.inventario.dto.CargoDto;
import com.nexos.inventario.dto.CargoResponseDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class CargoResponseToCargoDto {

    public CargoDto crear(CargoResponseDto cargoResponseDto) {
        return new CargoDto(cargoResponseDto.getId(), cargoResponseDto.getNombre(), new ArrayList<>());
    }
}
