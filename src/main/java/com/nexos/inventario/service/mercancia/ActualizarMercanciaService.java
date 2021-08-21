package com.nexos.inventario.service.mercancia;

import com.nexos.inventario.entity.MercanciaEntity;
import com.nexos.inventario.entity.PersonaEntity;

public interface ActualizarMercanciaService {

    Long ejecutar(MercanciaEntity mercanciaEntity, PersonaEntity usuarioAct);
}
