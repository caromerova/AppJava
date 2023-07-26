package org.example.utilidades;

public enum Mensajes {
    NOMBRE_SOLO_LETRAS("Señor Usuario, su nombre solo puede tener letras"),

    NOMBRE_MUY_CORTO("Señor Usuario, revise la cantidad de caracteres debe ser mayor o igual a 10"),

    CORREO_INVALIDO("El correo electronico que ingresaste no es valido"),

    ZONA_INVALIDA("la zona ingresada no es valida"),

    FECHA_INCORRECTA ("Señor usuario,la fecha no cumple con formato DD/MM/YYYY"),

    COSTO_NEGATIVO ("El valor del costo por persona no puede ser negativo"),

    OFERTA_SOLO_LETRAS ("Señor Usuario,solo se permiten letras en este campo"),

    OFERTA_DIGITOS ("Señor Usuario, el numero de caracteres para la oferta debe ser menor a 20"),

    NIT_ENTEROS("Señor Usuario solo se permiten numero enteros en este campo"),

    NIT_DIGITOS ("El numero de nit debe ser mayor a 10 digitos"),

    DIFERENCIA_FECHAS ("Revise la coherencia de las fechas"),

    NOMBRE_EMPRESA_LETRAS("Señor Usuario, su nombre solo puede tener letras"),

    NOMBRE_EMPRESA_DIGITOS("Señor Usuario, el nombre de la empresa no puede sobrepasar los 30 caracteres"),

    RESERVA_MENOR ("La cantidad de personas por reserva debe ser menor a 4 personas");
    ;

    private String mensaje;

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    Mensajes(String mensaje) {
        this.mensaje=mensaje;
    }
}
