package org.example.modelos;

import org.example.utilidades.MetodosPago;

import java.lang.ref.PhantomReference;
import java.util.Date;

public class Afiliado extends Usuario{

    private Integer valorMembresia;
    private MetodosPago metodosPago;
    private String documentoReferido;

    private final Double IVA=0.19;

    public Afiliado() {
    }

    @Override
    public Double calcularAnualidad() {
        //costo anual y restar el 20% del valor de la mensualidad
        Double calculo=this.getCostoAnual()-(this.getValorMembresia()*0.2);
        return calculo;
    }
    


    public Afiliado(Integer id, String nombres, String documento, Integer ubicacion, String correoElectronico, Integer valorMembresia, MetodosPago metodosPago, String documentoReferido) {
        super(id, nombres, documento, ubicacion, correoElectronico);
        this.valorMembresia = valorMembresia;
        this.metodosPago = metodosPago;
        this.documentoReferido = documentoReferido;
    }

    public Integer getValorMembresia() {
        return valorMembresia;
    }

    public void setValorMembresia(Integer valorMembresia) {
        this.valorMembresia = valorMembresia;
    }

    public MetodosPago getMetodosPago() {
        return metodosPago;
    }

    public void setMetodosPago(MetodosPago metodosPago) {
        this.metodosPago = metodosPago;
    }

    public String getDocumentoReferido() {
        return documentoReferido;
    }

    public void setDocumentoReferido(String documentoReferido) {
        this.documentoReferido = documentoReferido;
    }
    //METODOS ORDINARIOS
    public Double aplicarIvaMembresia(){
        return this.valorMembresia+this.IVA*this.valorMembresia;
    }


}

