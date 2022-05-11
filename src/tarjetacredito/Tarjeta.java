/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarjetacredito;

import java.util.Scanner;
import static tarjetacredito.TarjetaCredito.listadoTarjetas;

/**
 *
 * @author taller2
 */
public class Tarjeta {

    static Scanner entrada = new Scanner(System.in);
    //ATRIBUTOS
    int numero;
    String titular;
    String entidad;
    int fechaCaducidad;
    String status;

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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    //CONTRUCTORES
    public Tarjeta() {
        this.status = "OFF";
    }

    public Tarjeta(String titular, String entidad, int numero, int fechaCaducidad, String status) {

        this.numero = numero;
        this.titular = titular;
        this.entidad = entidad;
        this.fechaCaducidad = fechaCaducidad;
        this.status = status;

        System.out.println("Nombre del títular: " + this.titular
                + "\nNúmero de tarjeta: " + this.numero
                + "\nNombre de la entidad: " + this.entidad
                + "\nFecha de caducidad: " + this.fechaCaducidad
                + "\nEstado de la tarjeta: " + this.status);
    }

    //STRINGS JUNTOS
    @Override
    public String toString() {
        return "Tarjeta {" + "Títular= " + titular + ", Entidad= " + entidad + ", Número de tarjeta= " + numero
                + ", Fecha caducidad= " + fechaCaducidad + ", Estado de la tarejta= " + status;
    }

}
