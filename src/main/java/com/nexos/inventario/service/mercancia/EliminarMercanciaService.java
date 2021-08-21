package com.nexos.inventario.service.mercancia;

import com.nexos.inventario.entity.MercanciaEntity;

public interface EliminarMercanciaService {

    void ejecutar(MercanciaEntity mercancia, Long user);
}
