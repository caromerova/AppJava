package org.example.modelos;

import org.example.validaciones.ReservaValidacion;

public class Reserva {

   private Integer id;
    private Integer idUsuario;
    private   Integer idOferta;
    private  Double fechaReserva;
    private  Integer cantidadUsuarios;

    private Double costoTotal;

    protected ReservaValidacion validacion = new ReservaValidacion();
    public Reserva() {
    }

    public Reserva(Integer id, Integer idUsuario, Integer idOferta, Double fechaReserva, Integer cantidadUsuarios, Double costoTotal) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.idOferta = idOferta;
        this.fechaReserva = fechaReserva;
        this.cantidadUsuarios = cantidadUsuarios;
        this.costoTotal = costoTotal;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Integer getIdOferta() {
        return idOferta;
    }

    public void setIdOferta(Integer idOferta) {
        this.idOferta = idOferta;
    }

    public Double getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(Double fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public Integer getCantidadUsuariosReserva() {
        return cantidadUsuarios;
    }

    public void setCantidadUsuariosReserva(Integer cantidadUsuarios) {
        try {
            this.validacion.validarCantidadReserva( cantidadUsuarios);
            this.cantidadUsuarios = cantidadUsuarios;
        } catch (Exception error){
            System.out.print(error.getMessage());
        }
        }

    public Double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(Double costoTotal) {
        this.costoTotal = costoTotal;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "id=" + id +
                ", idUsuario=" + idUsuario +
                ", idOferta=" + idOferta +
                ", fechaReserva=" + fechaReserva +
                ", cantidadUsuarios=" + cantidadUsuarios +
                ", costoTotal=" + costoTotal +

                '}';
    }
}