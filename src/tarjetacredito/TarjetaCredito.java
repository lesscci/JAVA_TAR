/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarjetacredito;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import static tarjetacredito.Tarjeta_Metodos.salir;

/**
 *
 * @author taller2
 */
public class TarjetaCredito {
    
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        TarjetaCredito programa = new TarjetaCredito();
        programa.menu();

    }

    private void menu() {
        int opcion; //Guardaremos la opcion del usuario

        while (!salir) {
            System.out.println("""
                               =====================MEN\u00da======================
                               1.- Anadir nueva tarjeta
                               2.- Mostrar Tarjetas
                               3.- Buscar Tarjetas
                               4.- Activar
                               5.- Borrar
                               6.- Salir
                               ================================================""");

            try {
                System.out.println("Escribe una de las opciones");
                opcion = entrada.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado la opcion 1");
                        Tarjeta_Metodos.anadirTarjetas();
                        break;

                    case 2:
                        System.out.println("Has seleccionado la opcion 2");
                        Tarjeta_Metodos.mostrarContactos();
                        break;

                    case 3:
                        System.out.println("Has seleccionado la opcion 3");
                        Tarjeta_Metodos.buscarTarjeta();
                        break;
                    case 4:
                        System.out.println("Has seleccionado la opcion 4");
                        Tarjeta_Metodos.activar();
                        break;

                    case 5:
                        System.out.println("Has seleccionado la opcion 5");
                        Tarjeta_Metodos.borrar();
                        break;

                    case 6:
                        salir = true;
                        System.out.println("Gracias por usar el prorama <3");
                        break;

                    default:
                        System.out.println("Solo números entre 1 y 6");
                } //SI USUARIO NO INGRESA UN NÚMERO
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                entrada.next();

            }
        }
    }
}
