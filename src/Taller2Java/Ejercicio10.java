package Taller2Java;

import java.util.Scanner;

public class Ejercicio10 {
    private static Scanner dato;
    private static int cuenta;
    private static int cuentaConsulta;
    private static double saldo;
    private static  double deposito;;
    private static  double retiro;;
    private static boolean salir = true;
    private static int opcion;

    public void Ejercicio10(){
        dato = new Scanner(System.in);
        do {
            menu();
            opcion = capturarOpcion();
            salir = evaluarOpcion(opcion);
        } while (salir == true);
    }

    private void menu() {
        System.out.println("\n--------------- BANCO FIEL ---------------");
        System.out.println("\nSeleccione la operación a realizar:\n ");
        System.out.println("[1]. Ingreso");
        System.out.println("[2]. Retiro");
        System.out.println("[3]. Consultar Saldo");
        System.out.println("[4]. Salir ");
    }

    private int capturarOpcion() {
        Scanner entrada = new Scanner(System.in);
        return entrada.nextInt();
    }

    private void solicitarDato(String forma) {
        System.out.println("Ingrese " + forma + ": ");
    }

    private double capturarDatoDouble() {
        return dato.nextDouble();
    }

    private int capturarDatoInteger() {
        return dato.nextInt();
    }

    private boolean evaluarOpcion(int opcion){
        switch (opcion) {
            case 1:
                ingresar();
                return true;
            // break;
            case 2:
                retirar();
                return true;
            // break;
            case 3:
                consultarSaldo();
                return true;
            // break;
            case 4:
                System.out.println("Hasta pronto, gracias por utilizar los servicios del Banco Fiel.\n\n");
                return false;
            // break;
            default:
                System.out.println("Opción incorrecta");
        }
        return true;
    }

    private void ingresar() {
        System.out.println("\nVamos a realizar un Ingreso (Monto mínimo $100)");
        solicitarDato("número de cuenta");
        cuenta = capturarDatoInteger();
        solicitarDato("Monto");
        deposito = capturarDatoDouble();
        if (deposito >= 100){
            System.out.println("Su Transacción ha sido exitosa");
            saldo = saldo + deposito;
        }else {
            System.out.println("Ingrese un Monto superior a $100");
        }
    }

    private void retirar() {
        System.out.println("\nVamos a realizar un Retiro");
        solicitarDato("el número de la cuenta");
        cuentaConsulta = capturarDatoInteger();
        solicitarDato("la cantidad a retirar");
        retiro = capturarDatoDouble();
        if (cuentaConsulta == cuenta && retiro <= saldo){
            System.out.println("Su Retiro ha sido exitoso");
            saldo = saldo - retiro;
        }else {
            System.out.println("La cuenta no coincide o no tiene fondos suficientes para la transacción");
        }
    }

    private void consultarSaldo() {
        System.out.println("\nVamos a Consultar el saldo de su Cuenta");
        solicitarDato("el número de la cuenta");
        cuentaConsulta = capturarDatoInteger();
        if (cuentaConsulta == cuenta){
            System.out.println("Usuario con la Cuenta No. " + cuentaConsulta + " el saldo es de " + saldo + " pesos");
        }else {
            System.out.println("La cuenta no coincide o no tiene fondos suficientes para la transacción");
        }
    }
}
