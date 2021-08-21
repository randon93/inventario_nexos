package com.nexos.inventario.controller;

import com.nexos.inventario.dto.EliminarMercanciaDto;
import com.nexos.inventario.dto.MercanciaResponseDto;
import com.nexos.inventario.manejadores.mercancia.ActualizarMercanciaManejador;
import com.nexos.inventario.manejadores.mercancia.CrearMercanciaManejador;
import com.nexos.inventario.manejadores.mercancia.EliminarMercanciaManejador;
import com.nexos.inventario.service.mercancia.ListarMercanciaService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/mercancia")
@Api(tags = {"CONTROLADOR MERCANCIA"})
public class MercanciaController {

    @Autowired
    private CrearMercanciaManejador crearMercanciaManejador;

    @PostMapping
    public Long crear(@RequestBody MercanciaResponseDto mercanciaResponseDto) {
        return crearMercanciaManejador.ejecutar(mercanciaResponseDto);
    }

    @Autowired
    private ListarMercanciaService listarMercanciaService;

    @GetMapping
    public List<MercanciaResponseDto> listar() {
        return listarMercanciaService.ejecutar();
    }

    @Autowired
    private EliminarMercanciaManejador eliminarMercanciaManejador;

    @DeleteMapping
    public void eliminar(@RequestBody EliminarMercanciaDto eliminarMercanciaDto) {
        eliminarMercanciaManejador.ejecutar(eliminarMercanciaDto);
    }

    @Autowired
    private ActualizarMercanciaManejador actualizarMercanciaManejador;

    @PutMapping
    public void actaulziar(@RequestBody MercanciaResponseDto mercanciaResponseDto) {
        actualizarMercanciaManejador.ejecutar(mercanciaResponseDto);
    }
}
