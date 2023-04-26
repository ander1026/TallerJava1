package Taller2Java;

import java.util.Scanner;

public class Ejercicio8 {
    private Scanner dato;
    private String nombre;
    private String apellidos;
    private String torta;
    private double total;
    private boolean salir = true;
    private int opcion;
    private String[] tortas = new String[]{"Torta 1","Torta 2", "Torta 3", "Torta 4"};
    private String[] sabor = new String[]{"Chocolate","Vainilla", "Fresa", "Vino"};
    private int[] cantidad = new int[]{10,8,4,6};
    private String[] decoracion = new String[]{"Decoración 1","Decoración 2", "Decoración 3", "Decoración 4"};
    private double[] precio = new double[]{10000,8000,5000,7000};
    private int cantidad1;

    public void Ejercicio8(){
        dato = new Scanner(System.in);
        System.out.println("--------------- PASTELERIA DON CARLOS ---------------");
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

    private void menu() {
        System.out.println("\n--------------- PASTELERIA DON CARLOS ---------------");
        System.out.println("\nElija una opción:");
        System.out.println("[1]. Consultar Tortas Disponibles");
        System.out.println("[2]. Registrar Pedido");
        System.out.println("[3]. Salir ");
    }

    private int capturarOpcion() {
        Scanner entrada = new Scanner(System.in);
        return entrada.nextInt();
    }

    private void solicitarNombre() {
        System.out.println("Digite su Nombre: ");
    }

    private void solicitarApellidos() {
        System.out.println("Digite sus Apellidos: ");
    }

    private void solicitarProducto() {
        System.out.println("Escriba el nombre del producto que desea comprar : ");
    }
    private void solicitarCantidad() {
        System.out.println("Escriba la cantidad que va a comprar: ");
    }

    private String capturarDatoString() {
        return dato.nextLine();
    }

    private int capturarDatoInteger(){return dato.nextInt();}

    private boolean evaluarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                consultarTortas();
                return true;
            case 2:
                registrarPedido();
                return true;
            case 3:
                System.out.println("Ha sido un gusto atenderlo " + nombre + " " + apellidos + ". vuelva pronto...\n\n");
                return false;
            default:
                System.out.println("Opción incorrecta");
        }
        return true;
    }


    private void consultarTortas(){
        for (int i=0; i< tortas.length; i++){
            System.out.println("Producto 1: " + tortas[i] + ", Sabor: " + sabor[i] + ", Cantidad Porciones: " +
                    cantidad[i] + ", Decoración: " + decoracion[i] + ", Precio: " + precio[i]);
        }
    }

    private void registrarPedido(){
        int bandera=0;
        solicitarProducto();
        torta = capturarDatoString();
        solicitarCantidad();
        cantidad1 = capturarDatoInteger();
        dato.nextLine();
        for (int i=0; i< tortas.length; i++){

            if (tortas[i].equals(torta)){
                total=calcular(precio[i],cantidad1);
                System.out.println(nombre + " " + apellidos + ", su pedido de " + cantidad1 + " unidades de " + tortas[i] + ", Sabor a " + sabor[i] + ", con Decoración, " +
                        decoracion[i] + ", de " + cantidad[i] + " Porciones. Es por valor de: "  + total + " pesos.");
                bandera=1;
            }
        }
        if (bandera !=1){
            System.out.println("Producto no Disponible para la venta");
        }
    }

    private double calcular(double precioF, int cantidadF){
        return precioF*cantidadF;
    }
}
