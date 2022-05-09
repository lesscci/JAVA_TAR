/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarjetacredito;

/**
 *
 * @author taller2
 */
public  class Tarjeta {

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
        System.out.println("Esta tarjeta no tiene información :(");
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
    public void d(){
        
    }
    public void activar() {
        System.out.println("Activando la tarjeta");
    }

    public void pagar() {
        System.out.println("Pagando");
    }

    public void anular() {
        System.out.println("Anulando");
    }

}
