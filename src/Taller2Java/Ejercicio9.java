package Taller2Java;

import java.util.Scanner;

public class Ejercicio9 {

    private Scanner dato;
    private double alto;
    private double largo;
    private double ancho;
    private double total;
    private double base1;
    private double base2;
    private boolean salir = false;
    private int opcion;
    public void Ejercicio9(){
        dato = new Scanner(System.in);
        do {
            menu();
            opcion = capturarOpcion();
            salir = evaluarOpcion(opcion);
        } while (salir == false);
    }

    private boolean evaluarOpcion(int opcion){
        switch (opcion) {
            case 1:
                rectangulo();
                return false;
            case 2:
                triangulo();
                return false;
            case 3:
                trapecio();
                return false;
            case 4:
                System.out.println("Salio del sistema\n\n");
                return true;
            default:
                System.out.println("Opción incorrecta");
        }
        return true;
    }

    private void rectangulo(){
        System.out.println("\nVamos a calcular el área del Rectángulo.");
        solicitarDato("el Largo");
        largo = capturarDato();
        solicitarDato("el ancho");
        ancho = capturarDato();
        total=calcular(largo,ancho,0,1);
        System.out.println("El area del rectangulo es: " + total);
    }

    private void triangulo(){
        System.out.println("\nVamos a calcular el área o superficie del Triángulo.");
        solicitarDato("la base");
        base1 = capturarDato();
        solicitarDato("la altura");
        alto = capturarDato();
        total=calcular(base1, alto,0,2);
        System.out.println("El area del triangulo es: " + total);
    }

    private void trapecio(){
        System.out.println("\nVamos a calcular el área del Trapecio. ");
        solicitarDato("la base 1");
        base1 = capturarDato();
        solicitarDato("la base 2");
        base2 = capturarDato();
        solicitarDato("la altura");
        alto = capturarDato();
        total=calcular(base1, base2,alto,3);
        System.out.println("El area del trapecio es: " + total);
    }

    private double calcular(double num1, double num2, double num3, int f){
        double formula=0.0;
        if (f==1){
            formula = num1 * num2;
        }else if(f==2){
            formula = (num1 * num2)/2;
        }else if(f==3){
            formula = (num1 + num2)/2*num3;
        }
        return formula;
    }
    private int capturarOpcion() {
        Scanner entrada = new Scanner(System.in);
        return entrada.nextInt();
    }

    private double capturarDato() {
        return dato.nextDouble();
    }

    private void solicitarDato(String forma) {
        System.out.println("Ingrese " + forma + ": ");
    }
    private void menu() {
        System.out.println("\n--------------- CALCULAR AREAS ---------------");
        System.out.println("\nSeleccione la figura a la cual desea calcular el área:\n ");
        System.out.println("[1]. Rectángulo");
        System.out.println("[2]. Triángulo");
        System.out.println("[3]. Trapecio");
        System.out.println("[4]. Salir ");
    }
}
