package Taller1Java;

import java.util.Scanner;

public class Ejercicio3 {
    private String nombre, apellidos, nombreMadre, apellidosMadre, nombrePadre, apellidosPadre;

    private Scanner dato;

    public void Ejercicio3(){
        dato = new Scanner(System.in);

        solicitarNombre();
        nombre = capturarDatoString();

        solicitarApellidos();
        apellidos = capturarDatoString();

        solicitarNombrePadre();
        nombrePadre = capturarDatoString();

        solicitarApellidosPadre();
        apellidosPadre = capturarDatoString();

        solicitarNombreMadre();
        nombreMadre = capturarDatoString();

        solicitarApellidosMadre();
        apellidosMadre = capturarDatoString();

        imprimir();
    }

    private void solicitarNombre(){
        System.out.println("Digite el Nombre: ");
    }

    private void solicitarApellidos(){
        System.out.println("Digite los Apellidos: ");
    }

    private void solicitarNombrePadre(){
        System.out.println("Digite el Nombre de su Padre: ");
    }

    private void solicitarApellidosPadre(){
        System.out.println("Digite los Apellidos de su Padre: ");
    }

    private void solicitarNombreMadre(){
        System.out.println("Digite el Nombre de su Madre: ");
    }

    private void solicitarApellidosMadre(){
        System.out.println("Digite los Apellidos de su Madre: ");
    }

    private String capturarDatoString(){
        return dato.nextLine();
    }

    private void imprimir(){
        System.out.println("Yo " + nombre + " " + apellidos + " soy hijo de " +
                nombreMadre + " " + apellidosMadre + " y " + nombrePadre + " " + apellidosPadre );
    }
}
