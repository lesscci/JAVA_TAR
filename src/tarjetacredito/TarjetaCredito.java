/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarjetacredito;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author taller2
 */
public class TarjetaCredito {

    Scanner entrada = new Scanner(System.in);
    ArrayList<Tarjeta> tarjetas = new ArrayList();

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
                               2. Activar
                               3. Pagar 
                               4. Anular
                               5. Salir
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
                    break;
                case 3:
                    System.out.println("Has seleccionado la opcion 3");
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
        System.out.println("Escriba el numero de tarjeta");
        int numero = entrada.nextInt();
        System.out.println("Escriba el nombre y apellido del titular");
        String titular = entrada.nextLine();
        System.out.println("Escriba el nombre de la entidad");
        String entidad = entrada.nextLine();
        System.out.println("Escriba el año de caducidad de la tarjeta");
        int fechaCaducidad = entrada.nextInt();
        
        tarjetas.add(numero, titular, entidad, fechaCaducidad);

    }

}
