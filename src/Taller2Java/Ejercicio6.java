package Taller2Java;

import java.util.Scanner;

public class Ejercicio6 {
    private static Scanner dato;
    private static String nombre;
    private static String apellidos;
    private static String motoReferencia;
    private static String observacion;
    private static String fecha;
    private static String novedad;
    private static String arreglo;
    private static String placa;
    private static boolean salir = true;
    private static int opcion;

    public void Ejercicio6 (){
        dato = new Scanner(System.in);
        System.out.println("--------------- TALLER DE MOTOS EL MAQUINISTA ---------------");
        solicitarNombre();
        nombre = capturarDatoString();
        solicitarApellidos();
        apellidos = capturarDatoString();
        do {
            menu();
            opcion = capturarOpcion();
            salir = evaluarOpcion(opcion);
        } while (salir == true);
    }

    private static void menu() {
        System.out.println("\nElija una opción:");
        System.out.println("[1]. Ingreso Moto al Taller");
        System.out.println("[2]. Salida Moto del Taller");
        System.out.println("[3]. Salir ");
    }

    private static int capturarOpcion() {
        Scanner entrada = new Scanner(System.in);
        return entrada.nextInt();
    }

    private static void solicitarNombre() {
        System.out.println("Digite su Nombre: ");
    }

    private static void solicitarApellidos() {
        System.out.println("Digite sus Apellidos: ");
    }

    private static void solicitarMotoReferencia(String estado) {
        System.out.println("Escriba la Referencia de la motocicleta que desea " + estado + ": ");
    }

    private static void solicitarPlacaMoto() {
        System.out.println("Escriba la Placa de la Motocicleta: ");
    }

    private static void solicitarObservaciones() {
        System.out.println("Escriba las observaciones de la Motocicleta: ");
    }

    private static void solicitarNovedad() {
        System.out.println("Escriba las novedades del arreglo de la Motocicleta: ");
    }

    private static void solicitarArreglo() {
        System.out.println("Escriba los arreglos realizados incluyendo repuestos, de la Motocicleta: ");
    }

    private static void solicitarFecha(String estado) {
        System.out.println("Registre la fecha de " + estado + ": ");
    }

    private static String capturarDatoString() {
        return dato.nextLine();
    }

    private static boolean evaluarOpcion(int opcion){
        switch (opcion) {
            case 1:
                ingresarMoto();
                return true;
            case 2:
                salidaMoto();
                return true;
            case 3:
                System.out.println("Ha sido un gusto atenderlo " + nombre + " " + apellidos + ". Hasta pronto...\n\n");
                return false;
            default:
                System.out.println("Opción incorrecta");
        }
        return true;
    }

    private static void ingresarMoto() {
        solicitarMotoReferencia("ingresar");
        motoReferencia = capturarDatoString();
        solicitarPlacaMoto();
        placa = capturarDatoString();
        solicitarObservaciones();
        observacion = capturarDatoString();
        solicitarFecha("ingreso");
        fecha = capturarDatoString();
        imprimirIngreso(motoReferencia, placa, observacion, fecha);
    }

    private static void salidaMoto() {
        solicitarMotoReferencia("dar salida");
        motoReferencia = capturarDatoString();
        solicitarNovedad();
        novedad = capturarDatoString();
        solicitarArreglo();
        arreglo = capturarDatoString();
        solicitarFecha("salida");
        fecha = capturarDatoString();
        imprimirSalida(motoReferencia, novedad, arreglo, fecha);
    }

    private static void imprimirIngreso(String motoRef,String placaMoto, String observacionMoto, String fechaIng){
        System.out.println("La moto " + motoRef + " presenta las siguientes observaciones " + observacionMoto + " , registrada en la fecha: " + fechaIng);
    }

    private static void imprimirSalida(String motoRef, String motoNovedad, String arregloMoto, String fechaSal){
        System.out.println("La moto " + motoRef + " presenta las siguientes novedades " + motoNovedad + " , e incluye los siguientes arreglos : " + arregloMoto + ", registrada en la fecha: " + fechaSal);
    }
}
