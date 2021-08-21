package com.nexos.inventario.service.mercancia.impl;

import com.nexos.inventario.convertidores.MercanciaEntityToMercanciaResponseConvertidos;
import com.nexos.inventario.dao.MercanciaDao;
import com.nexos.inventario.dto.MercanciaResponseDto;
import com.nexos.inventario.entity.MercanciaEntity;
import com.nexos.inventario.service.mercancia.ListarMercanciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ListarMercanciaServiceImpl implements ListarMercanciaService {

    @Autowired
    private MercanciaDao mercanciaDao;

    @Autowired
    private MercanciaEntityToMercanciaResponseConvertidos mercanciaEntityToMercanciaResponseConvertidos;

    @Override
    public List<MercanciaResponseDto> ejecutar() {
        List<MercanciaEntity> mercanciaEntities = mercanciaDao.findAll();
        List<MercanciaResponseDto> responseDtos = new ArrayList<>();
        for (MercanciaEntity en : mercanciaEntities) {
            MercanciaResponseDto mercanciaResponseDto = mercanciaEntityToMercanciaResponseConvertidos.crear(en);
            responseDtos.add(mercanciaResponseDto);
        }
        return responseDtos;
    }
}
