package org.example.validaciones;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AfiliadoValidacionTest {
    private AfiliadoValidacion afiliadoValidacion;

    @BeforeEach
    public void setUp (){
        this.afiliadoValidacion=new AfiliadoValidacion();
    }
    @Test
    public void validarCostoMembresiaCorrecto(){
        Integer costoCorreco = 20000;
        Assertions.assertDoesNotThrow(()->this.afiliadoValidacion.ValidarCostoMembresia(costoCorreco));
    }
    @Test
    public void validarCostoMembresiaIncorrecto(){
        Integer costoIncorrecto= -1000;
        Exception exception=Assertions.assertThrows(Exception.class,()->this.afiliadoValidacion.validarCostoMembresia(costoIncorrecto));
        Assertions.assertEquals("aqui va el mensaje que espero",exception.getMessage());

        }


    }

}