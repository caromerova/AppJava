package org.example;

import org.example.modelos.*;
import org.example.utilidades.Util;


import java.util.Scanner;

public class Main {
  protected Util util = new Util();

    public static void main(String[] args) {


      Scanner teclado =  new  Scanner(System.in);
      Usuario usuario = new Usuario();//papá
      Afiliado afiliado=new Afiliado();//hijo

      //ACCEDIENDO A LOS ATRIBUTOS DE UN OBJETO
      usuario.setNombres("1234");
      afiliado.setNombres("ana");






    }

}