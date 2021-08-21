package com.nexos.inventario.service.cargo;

import com.nexos.inventario.dto.CargoDto;
import com.nexos.inventario.entity.CargoEntity;

public interface CrearCargoService {

    Long ejecutar(CargoEntity cargoEntity);
}
