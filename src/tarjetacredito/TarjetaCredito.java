/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarjetacredito;

import java.util.ArrayList;
import java.util.Scanner;
import static tarjetacredito.Tarjeta.activar;

/**
 *
 * @author taller2
 */
public class TarjetaCredito {

    static Scanner entrada = new Scanner(System.in);
    private static final ArrayList<Tarjeta> listadoTarjetas = new ArrayList<Tarjeta>();

    public static void main(String[] args) {

        TarjetaCredito programa = new TarjetaCredito();
        programa.start();

    }

    private void start() {

        Tarjeta AAB = new Tarjeta(800025888, "Natalie Gomez", "ING Direct", 22);

        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario

        while (!salir) {

            System.out.println("""
                               1. Anadir nueva tarjeta
                               2. Mostrar Tarjetas
                               3. Activar
                               4. Pagar
                               5. Anular
                               6. Salir
                               ******************************""");

            System.out.println("Escribe una de las opciones");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Has seleccionado la opcion 1");
                    datosTarjetas();
                    break;

                case 2:
                    System.out.println("Has seleccionado la opcion 2");
                    mostrarContactos();
                    break;
                    
                case 3:
                    System.out.println("Has seleccionado la opcion 3");
                    activar();
                    break;
                case 4:
                    System.out.println("Has seleccionado la opcion 4");
                    break;
                case 5:
                    salir = true;
                    break;
                default:
                    System.out.println("Solo números entre 1 y 5");
            }

        }

    }

    private void datosTarjetas() {
        Tarjeta tarjeta = new Tarjeta();
        listadoTarjetas.add(tarjeta);

        System.out.println("Escriba el numero de tarjeta");
        int numero = entrada.nextInt();
        tarjeta.setNumero(numero);

        System.out.println("Escriba el año de caducidad de la tarjeta");
        int fechaCaducidad = entrada.nextInt();
        tarjeta.setFechaCaducidad(fechaCaducidad);

        System.out.println("Escriba el nombre de la entidad");
        String entidad = entrada.next();
        tarjeta.setEntidad(entidad);

        System.out.println("Escriba el nombre y apellido del titular");
        String titular = entrada.next();
        tarjeta.setTitular(titular);
    }

    public static void mostrarContactos() {
        if (listadoTarjetas.isEmpty()) {
            System.out.println("La agenda está vacía, no hay contactos que mostrar");
        } else {
            for (int i = 0; i < listadoTarjetas.size(); i++) {
                System.out.println("**************************************************"
                        + "\nNúmero de tarjeta: " + listadoTarjetas.get(i).numero
                        + "\nAño de caducidad: " + listadoTarjetas.get(i).fechaCaducidad
                        + "\nNombre de la entidad: " + listadoTarjetas.get(i).entidad
                        + "\nNombre del titular: " + listadoTarjetas.get(i).titular
                        + "\n**************************************************");

   
         }
        }
    }

}
