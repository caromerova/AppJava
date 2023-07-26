package org.example.validaciones;

import org.example.utilidades.Mensajes;
import org.example.utilidades.Util;

import java.util.concurrent.ExecutionException;

public class ReservaValidacion {

    protected Util util = new Util();

    public ReservaValidacion(){}


    public Boolean validarCantidadReserva (Integer cantidadUsuariosReserva) throws Exception {
        String expresionRegular = "^[1-4]$";
        if (!Util.buscarCoincidencia(expresionRegular, String.valueOf(cantidadUsuariosReserva))){
            throw new Exception(Mensajes.RESERVA_MENOR.getMensaje());
        }
        return true;
    }


}

