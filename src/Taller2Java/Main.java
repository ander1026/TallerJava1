package Taller2Java;

import Taller2Java.*;

import java.util.Scanner;

public class Main {
    private static int opcion;
    private static boolean salir = false;
    public static void main(String[] args) {
        do {
            menu();
            opcion = capturarDato();
            salir = evaluarOpcion(opcion);
        }while(salir == false);
    }

    private static void menu(){
        System.out.println("--------------- MENU TALLER 2 ---------------");
        System.out.println("Escoja el Ejercicio a desarrollar del Taller 2:");
        System.out.println("[1]. Ejercicio 1");
        System.out.println("[2]. Ejercicio 2");
        System.out.println("[3]. Ejercicio 3");
        System.out.println("[4]. Ejercicio 4");
        System.out.println("[5]. Ejercicio 5");
        System.out.println("[6]. Ejercicio 6");
        System.out.println("[7]. Ejercicio 7");
        System.out.println("[8]. Ejercicio 8");
        System.out.println("[9]. Ejercicio 9");
        System.out.println("[10]. Ejercicio 10");
        System.out.println("[0]. Salir del Taller 2");
    }

    private static int capturarDato(){
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    private static boolean evaluarOpcion(int opcion){
        switch (opcion){
            case 1:
                Ejercicio1 ej1 = new Ejercicio1();
                ej1.Ejercicio1();
                return false;
            case 2:
                Ejercicio2 ej2 = new Ejercicio2();
                ej2.Ejercicio2();
                return false;
            case 3:
                Ejercicio3 ej3 = new Ejercicio3();
                ej3.Ejercicio3();
                return false;
            case 4:
                Ejercicio4 ej4 = new Ejercicio4();
                ej4.Ejercicio4();
                return false;
            case 5:
                Ejercicio5 ej5 = new Ejercicio5();
                ej5.Ejercicio5();
                return false;
            case 6:
                Ejercicio6 ej6 = new Ejercicio6();
                ej6.Ejercicio6();
                return false;
            case 7:
                Ejercicio7 ej7 = new Ejercicio7();
                ej7.Ejercicio7();
                return false;
            case 8:
                Ejercicio8 ej8 = new Ejercicio8();
                ej8.Ejercicio8();
                return false;
            case 9:
                Ejercicio9 ej9 = new Ejercicio9();
                ej9.Ejercicio9();
                return false;
            case 10:
                Ejercicio10 ej10 = new Ejercicio10();
                ej10.Ejercicio10();
                return false;
            case 0:
                return true;
            default:
                System.out.println("Opcion incorrecta");
        }
        return false;
    }
}
