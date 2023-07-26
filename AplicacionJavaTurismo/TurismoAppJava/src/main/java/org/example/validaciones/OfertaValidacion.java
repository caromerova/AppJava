package org.example.validaciones;

import org.example.utilidades.Mensajes;
import org.example.utilidades.Util;

import java.time.LocalDate;
import java.util.Date;

public class OfertaValidacion {

    protected Util util = new Util();

    public OfertaValidacion (){}

    public Boolean validarCaracteres (String titulo ) throws  Exception{
        String expresionRegular = "^[a-zA-ZñÑ ]+$";
        if (!Util.buscarCoincidencia(expresionRegular, titulo)){
            throw new Exception(Mensajes.OFERTA_SOLO_LETRAS.getMensaje());
        } else if (titulo.length() < 20 ) {
            throw new Exception(Mensajes.OFERTA_DIGITOS.getMensaje());
        }

        return true;
    }

    public Boolean validarFormatoFecha (String fecha) throws Exception{
        String expresionRegular = "^(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[0-2])/\\d{4}$";
        if (!Util.buscarCoincidencia(expresionRegular, fecha)){
            throw new Exception(Mensajes.FECHA_INCORRECTA.getMensaje());

        }else{
            return true;
        }
    }

    public Boolean validarDiferenciaFechas (LocalDate fechaInicial, LocalDate fechaFinal) throws Exception{

        if (fechaFinal.isBefore(fechaInicial)){
            throw new Exception(Mensajes.DIFERENCIA_FECHAS.getMensaje());

        }else{
            return true;
        }
    }


    public Boolean validarCosto (Double costoTotal) throws Exception {
        if (costoTotal <0 ){
            throw new Exception(Mensajes.COSTO_NEGATIVO.getMensaje());
        }
        return true;
    }
}





