package org.example;

import org.example.modelos.Local;
import org.example.modelos.Oferta;
import org.example.modelos.Reserva;
import org.example.modelos.Usuario;
import org.example.utilidades.Util;


import java.util.Scanner;

public class Main {
  protected Util util = new Util();

    public static void main(String[] args) {


      Scanner teclado =  new  Scanner(System.in);
      Usuario usuario = new Usuario();


      System.out.println("Bienvenido");
      System.out.println("recogiendo datos de usuario");
      System.out.println("Digita tu nombre y apellido");
      usuario.setNombres(teclado.nextLine());
      System.out.println("digite su correo");
      usuario.setCorreoElectronico(teclado.nextLine());

      Oferta oferta = new Oferta();
      System.out.println("Digite la fecha de inicio");
      oferta.setFechaInicio(teclado.nextLine());
      System.out.println("Digite la fecha final");
      oferta.setFechaFin(teclado.nextLine());

      Local local = new Local();
      System.out.println("ingrese su Nit");
      local.setNit(teclado.nextLine());

  //seguir creando main 



    }

}