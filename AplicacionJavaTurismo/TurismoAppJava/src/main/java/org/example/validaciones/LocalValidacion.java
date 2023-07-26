package org.example.validaciones;

import org.example.utilidades.Mensajes;
import org.example.utilidades.Util;

public class LocalValidacion {

    protected Util util = new Util();

    public LocalValidacion (){}

    public Boolean validarDigitos (String nit ) throws  Exception{

        String expresionRegular = "^-?\\d+$";
        if (!Util.buscarCoincidencia(expresionRegular, nit)){
            throw new Exception(Mensajes.NIT_ENTEROS.getMensaje());
        } else if (nit.length() < 10 ) {
            throw new Exception(Mensajes.NIT_DIGITOS.getMensaje());
        }

        return true;
    }

    public Boolean validarNombreEmpresa ( String nombre)throws  Exception {
        String expresionRegular = "^[a-zA-ZñÑ ]+$";
        if (!Util.buscarCoincidencia(expresionRegular, nombre)) {
            throw new Exception(Mensajes.NOMBRE_EMPRESA_LETRAS.getMensaje());
        } else if (nombre.length() > 30 ){

            throw new Exception(Mensajes.NOMBRE_EMPRESA_DIGITOS.getMensaje());
            }
        else
        {
            return true;
        }
    }
}