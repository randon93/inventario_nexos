package com.nexos.inventario.service.cargo.impl;

import com.nexos.inventario.convertidores.mapper.CargoMapper;
import com.nexos.inventario.dao.CargoDao;
import com.nexos.inventario.dto.CargoDto;
import com.nexos.inventario.entity.CargoEntity;
import com.nexos.inventario.excepcion.ExcepcionDuplicidad;
import com.nexos.inventario.service.cargo.CrearCargoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class CrearCargoServiceImpl implements CrearCargoService {

    @Autowired
    private CargoDao cargoDao;

    @Autowired
    private CargoMapper cargoMapper;

    @Override
    public Long ejecutar(CargoEntity cargoEntity) {
        validarNombreCargo(cargoEntity.getNombre());
        return cargoDao.save(cargoEntity).getId();
    }

    private void validarNombreCargo(String nombre) {
        CargoEntity cargoEntity = cargoDao.findByNombre(nombre).orElse(null);
        if (Objects.nonNull(cargoEntity)) {
            throw new ExcepcionDuplicidad("EL cargo" + nombre + " ya existe");
        }
    }
}
