package com.nexos.inventario.service.cargo.impl;

import com.nexos.inventario.convertidores.mapper.CargoMapper;
import com.nexos.inventario.dao.CargoDao;
import com.nexos.inventario.dto.CargoDto;
import com.nexos.inventario.entity.CargoEntity;
import com.nexos.inventario.service.cargo.ListarCargoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class ListarCargoServiceImpl implements ListarCargoService {

    @Autowired
    private CargoDao cargoDao;

    @Autowired
    private CargoMapper cargoMapper;

    @Override
    public List<CargoDto> ejecutar() {
        List<CargoEntity> listEntity = cargoDao.findAll();
        return cargoMapper.cargoEntityToCargoDto(listEntity);
    }
}
