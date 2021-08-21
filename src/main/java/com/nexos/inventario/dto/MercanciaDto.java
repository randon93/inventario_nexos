package com.nexos.inventario.dto;

import com.nexos.inventario.excepcion.ExcepcionFechaNoValida;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static com.nexos.inventario.util.ValidadorArgumento.validarNumerico;
import static com.nexos.inventario.util.ValidadorArgumento.validarObligatorio;
import static com.nexos.inventario.util.ValidadorArgumento.validarPositivo;


@Getter
@ToString
public class MercanciaDto {

    private static final String NOMBRE_ES_OBLIGATORIO = "El nombre es un campo obligatorio";
    private static final String CANTIDAD_DEBE_SER_ENTERO = "La cantidad debe de ser un numeor entero";
    private static final String CANTIDAD_DEBE_SER_POSITIVO = "La nueva catidad debe de ser mayor a CERO";

    private Long id;
    private String nombre;
    private Integer cantidad;
    private LocalDateTime fechaIngreso;
    private PersonaDto persona;
    private List<ActualizarMercanciaDto> actualizarMercancias;

    public MercanciaDto(Long id, String nombre, String cantidad, LocalDateTime fechaIngreso, PersonaDto persona) {

        validarObligatorio(nombre, NOMBRE_ES_OBLIGATORIO);
        validarNumerico(cantidad, CANTIDAD_DEBE_SER_ENTERO);
        validarFecha(fechaIngreso);

        this.id = id;
        this.nombre = nombre;
        this.cantidad = Integer.parseInt(cantidad);
        this.fechaIngreso = fechaIngreso;
        this.persona = persona;
        this.actualizarMercancias = new ArrayList<>();
    }

    private void validarFecha(LocalDateTime fechaRegistro) {
        LocalDateTime fechaHoy = LocalDateTime.now();
        Boolean exito = fechaHoy.isBefore(fechaRegistro);
        if (exito) {
            throw new ExcepcionFechaNoValida("La fecha '" + fechaRegistro + "' no es valida, ValidadorArgumento.");
        }
    }

    public void actualizarCantidad(Integer nuevaCantidad) {
        validarPositivo(nuevaCantidad.doubleValue(), CANTIDAD_DEBE_SER_POSITIVO);
        this.cantidad = nuevaCantidad;
    }

}
