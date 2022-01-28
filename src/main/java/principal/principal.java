package principal;

import clases.Atleta;
import clases.ComparatorMarca;
import clases.Marca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Ejercicio 7 (Desarrollo de clases)
 *
 * //MODELOS
 * Programa que lea el nombre de cuatro atletas y las tres mejores marcas de cada uno de ellos en la prueba de maratón
 * (en horas, minutos y segundos),y los eventos donde las lograron.
 *
 * //NEGOCIO
 * El programa debe  mostrar un listado indicando marca, atleta y nombre del evento para las marcas inferiores a 2 horas  y cincuenta minutos,
 * ordenado de mejor a peor registro.
 * Implemente la clase Atleta.
 *
 * Entidades -> Atletas, marcas, pruebas, eventos
 */
public class principal {

    public static Scanner sc = new Scanner(System.in);

    public static Marca leerMarca(String name) {
        Marca nuevaMarca = new Marca();

        System.out.println("Introduccion de marca");

        System.out.println("Introduzca evento");
        nuevaMarca.setEvento(sc.nextLine());

        System.out.println("Introduzca horas");
        nuevaMarca.setHoras(Integer.parseInt(sc.nextLine()));

        System.out.println("Introduzca minuto");
        nuevaMarca.setMinutos(Integer.parseInt(sc.nextLine()));

        System.out.println("Introduzca segundos");
        nuevaMarca.setSegundos(Integer.parseInt(sc.nextLine()));

        nuevaMarca.setNombreAtleta(name);
        return nuevaMarca;
    }

    public static void main(String[] args) {

        List<Atleta> atletas = new ArrayList();

        String input = "";
        do {
            Atleta atletaNuevo = new Atleta();

            System.out.println("Introduzca el nombre de un atleta");
            atletaNuevo.setNombre(sc.nextLine());

            atletaNuevo.setMarca1(leerMarca(atletaNuevo.getNombre()));
            atletaNuevo.setMarca2(leerMarca(atletaNuevo.getNombre()));
            atletaNuevo.setMarca3(leerMarca(atletaNuevo.getNombre()));
            atletas.add(atletaNuevo);

            System.out.println("Introduzca fin para terminar programa o cualquier otra cosa para introducir un nueva atleta.");
            input = sc.nextLine();

        } while (!input.equals("fin"));


        Marca limitMarca = new Marca(2, 50, 0, "", "");
        List<Marca> mejoresMarcas = new ArrayList();
        for (int i = 0; i < atletas.size(); i++) {
            Atleta aux = atletas.get(i);
            Marca marca1 = aux.getMarca1();
            if (marca1.compareTo(limitMarca) == 1) {
                mejoresMarcas.add(marca1);
            }

            Marca marca2 = aux.getMarca1();
            if (marca2.compareTo(limitMarca) == 1) {
                mejoresMarcas.add(marca2);
            }

            Marca marca3 = aux.getMarca1();
            if (marca3.compareTo(limitMarca) == 1) {
                mejoresMarcas.add(marca3);
            }
        }

        mejoresMarcas.sort(new ComparatorMarca());


        for (int i = 0; i < mejoresMarcas.size(); i++) {
            System.out.println(mejoresMarcas.get(i).toString());
        }
    }

}
