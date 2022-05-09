/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarjetacredito;

import java.util.Scanner;

/**
 *
 * @author taller2
 */
public  class Tarjeta {
static Scanner entrada = new Scanner(System.in);
    //ATRIBUTOS
    int numero;
    String titular;
    String entidad;
    int fechaCaducidad;

    //GETTERS AND SETTERS
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getEntidad() {
        return entidad;
    }

    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }

    public int getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(int fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    //CONTRUCTORES
    public Tarjeta() {
        System.out.println("Tarjeta vacia...");
    }

    public Tarjeta(int numero, String titular, String entidad, int fechaCaducidad) {

        this.numero = numero;
        this.titular = titular;
        this.entidad = entidad;
        this.fechaCaducidad = fechaCaducidad;

        System.out.println("Número de tarjeta: " + this.numero
                + "\nNombre del títular: " + this.titular
                + "\nNombre de la entidad: " + this.entidad
                + "\nFecha de caducidad: " + this.fechaCaducidad);
    }

    //METODOS
   
    
    public static void activar() {
  
        boolean salir = false;
        char opcion;
        while (!salir){
            System.out.println("Quieres activar la tarjeta? S/N");
            opcion = entrada.next().charAt(0);
            
            switch(opcion){
                case 1: System.out.println("Activando...");
                            ;
                case 2: System.out.println("La tarjeta permanece desactivada");
            }
        }
    }

    public void pagar() {
        System.out.println("Pagando");
    }

    public void anular() {
        System.out.println("Anulando");
    }

}
