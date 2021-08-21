package com.nexos.inventario.excepcion;

public class ExcepcionFechaNoValida extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public ExcepcionFechaNoValida(String message) {
        super(message);
    }
}
