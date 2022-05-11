/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarjetacredito;

import java.util.ArrayList;
import java.util.List;
import static tarjetacredito.TarjetaCredito.entrada;

/**
 *
 * @author Natalie
 */
public class Tarjeta_Metodos {
     public static boolean salir = false;
         public static final List<Tarjeta> listadoTarjetas = new ArrayList<Tarjeta>();
     
     public static void anadirTarjetas() {
        Tarjeta tarjeta = new Tarjeta();
        listadoTarjetas.add(tarjeta);
        boolean existe = false;
        boolean encontrado = false;
        int numero;

        //QUE NO NOS AÑADAN UNA TARJETA CON EL MISMO NÚMERO
        while (!existe) {
            System.out.println("Escriba el numero de tarjeta");
            numero = entrada.nextInt();

            int i = 0;
            while (!encontrado && listadoTarjetas.size() > 0 && i < listadoTarjetas.size()) {
                if (listadoTarjetas.get(i).getNumero() == (numero)) {
                    encontrado = true;
                }
                i++;
            }

            if (encontrado) {
                encontrado = false;
                System.out.println("ERROR: La tarjeta ya existe.”");
            } else {
                existe = true;
                tarjeta.setNumero(numero);
            }

        }

        entrada.nextLine();
        System.out.println("Escriba el nombre y apellido del titular");
        String titular = entrada.nextLine();
        tarjeta.setTitular(titular);

        System.out.println("Escriba el nombre de la entidad");
        String entidad = entrada.nextLine();
        tarjeta.setEntidad(entidad);

        System.out.println("Escriba el año de caducidad de la tarjeta");
        int fechaCaducidad = entrada.nextInt();
        tarjeta.setFechaCaducidad(fechaCaducidad);

    }

    public static void mostrarContactos() {
        if (listadoTarjetas.isEmpty()) {
            System.out.println("La base de datos está vacía, no hay tarjetas que mostrar");
        } else {
            for (int i = 0; i < listadoTarjetas.size(); i++) {
                System.out.println("**************************************************"
                        + "\n" + listadoTarjetas.get(i).toString()
                        + "\n**************************************************");
            }
        }
    }

    public static void buscarTarjeta() {
        boolean encontrado = false;
        int opcionMenu = 0;
        int numero = 1;
        String nombre = null;

        //BUCLE MENÚ
        while (!salir) {

            //OPCIONES
            System.out.println("""
                               Seleccione por cuál campo quiere buscar:
                               1.- Buscar por nombre
                               2.- Buscar por número de tarjeta
                               3.- Volver al menú""");
            opcionMenu = entrada.nextInt();

            //OPCIÓN 1
            if (opcionMenu == 1) {
                System.out.println("Dime el nombre de la persona:");
                nombre = entrada.next();
                System.out.println();

                //OPCIÓN 2
            } else if (opcionMenu == 2) {
                System.out.println("Dime el número de tarjeta de la persona:");
                numero = entrada.nextInt();
                System.out.println();
            }
            //SI NO SALGO DEL MENÚ, ENTRO A BUSCAR LA TARJETA
            if (opcionMenu != 3) {
                int i = 0;
                //MIENTRAS NO SALGA Y RECORRA TODO EL ARRAY BUSCA LA TARJETA QUE PIDA EL USUARIO
                while (encontrado == false && i < listadoTarjetas.size()) {
                    //COMPARO EL NOMBRE RECOGIDO POR SCANNER ANTES Y LO COMPARO CON LOS QUE TENGO EN LA LISTA
                    if (opcionMenu == 1 && listadoTarjetas.get(i).getTitular().equals(nombre)) {
                        encontrado = true;
                        System.out.println("Se ha encontrado una tarjeta con los criterios especificados:\n" + listadoTarjetas.get(i).toString() + "\n");
                        //COMPARO EL NÚMERO RECOGIDO POR SCANNER ANTES Y LO COMPARO CON LOS QUE TENGO EN LA LISTA
                    } else if (opcionMenu == 2 && listadoTarjetas.get(i).getNumero() == numero) {
                        encontrado = true;
                        System.out.println("Se ha encontrado una tarjeta con los criterios especificados:\n" + listadoTarjetas.get(i).toString() + "\n");
                    }
                    //BUCLE
                    i++;
                }
                //SI NO LO ENCUENTRA EN EL BUCLE
                if (!encontrado) {
                    System.out.println("No existe esta tarjeta en la memoria, intentalo nuevamente\n");
                } else {
                    encontrado = false;
                }
            } else {
                //SI PULSO 3
                salir = true;
            }

        }

    }

    public static void borrar() {

        Tarjeta tarjetaBorrar = null;
        boolean encontrado = false;
        boolean salir = false;
        char borrar = 0;
        int numero;
        int i = 0;

        //PEDIR LA TARJETA AL USUARIO QUE QUIERE BORRAR
        System.out.println("¿Qué tarjeta quieres borrar?");
        System.out.println("Introduce el número: ");
        numero = entrada.nextInt();

        //RECORRER EL ARRAYLIST MIENTRAS NO LO ENCUENTRE
        while (encontrado == false && i < listadoTarjetas.size()) {

            //CUANDO LO ENCUENTRA...
            if (listadoTarjetas.get(i).getNumero() == (numero)) {
                encontrado = true;
                tarjetaBorrar = listadoTarjetas.get(i);
                System.out.println("Se ha encontrado una tarjeta con los criterios especificados:\n");
            }

            i++;
        }
        //EL USUARIO TIENE QUE CONFIRMAR QUE QUIERE BORRAR LA TARJETA
        if (encontrado && tarjetaBorrar != null) {
            while (!salir && (borrar != 'S' || borrar != 'N')) {
                System.out.println("Estas seguro que quieres borrar esta tarjeta? ");
                System.out.println("No podrás recuperar esta tarjeta. Indica una de las siguientes opciones:\nS/N");
                borrar = entrada.next().toUpperCase().charAt(0);

                switch (borrar) {
                    case 'S':
                        listadoTarjetas.remove(tarjetaBorrar);
                        System.out.println("La tarjeta se ha borrado correctamente\n" + tarjetaBorrar.toString());
                        salir = true;
                        break;
                    case 'N':
                        salir = true;
                        System.out.println("La tarjeta no ha sido borrada");
                        break;
                    default:
                        System.out.println("Tienes que indicar una de las opciones S(Sí)/N(No)");
                        break;
                }
            }

        } else {
            System.out.println("No se ha encontrado ninguna tarjeta que borrar.");
        }
    }

    public static void activar() {
        char activar = 0;
        Tarjeta tarjetaActivar = null;
        boolean encontrado = false;
        boolean salir = false;
        char borrar = 0;
        int numero;
        int i = 0;
        String activado = "ON";

        //PEDIR LA TARJETA AL USUARIO QUE QUIERE ACTIVAR
        System.out.println("¿Qué tarjeta quieres activar?");
        System.out.println("Introduce el número: ");
        numero = entrada.nextInt();

        //RECORRER EL ARRAYLIST MIENTRAS NO LO ENCUENTRE
        while (encontrado == false && i < listadoTarjetas.size()) {

            //CUANDO LO ENCUENTRA...
            if (listadoTarjetas.get(i).getNumero() == (numero)) {
                encontrado = true;
                tarjetaActivar = listadoTarjetas.get(i);
                System.out.println("Se ha encontrado una tarjeta con los criterios especificados:\n");
            }

            i++;
        }
        //EL USUARIO TIENE QUE CONFIRMAR QUE QUIERE ACTIVAR LA TARJETA
        if (encontrado && tarjetaActivar != null) {
            while (!salir && (activar != 'S' || activar != 'N')) {
                System.out.println("Quieres activar esta tarjeta? ");
                System.out.println("Indica una de las siguientes opciones:\nS/N");
                activar = entrada.next().toUpperCase().charAt(0);

                switch (activar) {
                    case 'S':
                        tarjetaActivar.setStatus(activado);
                        System.out.println("La tarjeta se ha activado correctamente\n" + tarjetaActivar.toString());
                        salir = true;
                        break;
                    case 'N':
                        salir = true;
                        System.out.println("La tarjeta no ha sido activada");
                        break;
                    default:
                        System.out.println("Tienes que indicar una de las opciones S(Sí)/N(No)");
                        break;
                }
            }

        } else {
            System.out.println("No se ha encontrado ninguna tarjeta que borrar.");
        }
    }

    
}
