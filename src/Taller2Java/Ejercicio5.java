package Taller2Java;

import java.util.Scanner;

public class Ejercicio5 {
    private static Scanner dato;
    private static String nombre;
    private static String apellidos;
    private static String nombreProducto;
    private static String p1 = "jarbin";
    private static String c1 = "Jarabe para la tos";
    private static double pr1 = 5000.0;
    private static String p2 = "Dristan Caliente";
    private static String c2 = "Sobre bebida caliente para la gripa";
    private static double pr2 = 2000.0;
    private static String p3 = "Cureband";
    private static String c3 = "Curitas personales doble pegante caja x 10";
    private static double pr3 = 3000.0;
    private static String p4 = "Shot-B";
    private static String c4 = "Multivitaminico de la A a la Z, caja x 30";
    private static double pr4 = 26000.0;
    private static boolean salir = false;
    private static int opcion;

    public void Ejercicio5(){
        dato = new Scanner(System.in);
        System.out.println("--------------- DROGUERIA MI SALUD ---------------");
        System.out.println("_______________      Bienvenido    _______________");
        solicitarNombre();
        nombre = capturarDatoString();
        solicitarApellidos();
        apellidos = capturarDatoString();
        do {
            menu();
            opcion = capturarOpcion();
            salir = evaluarOpcion(opcion);
        } while (salir == false);

    }
    private static void menu() {
        System.out.println("\nElija una opción:");
        System.out.println("[1]. Comprar Producto");
        System.out.println("[2]. Consultar Todos los Productos");
        System.out.println("[3]. Consultar Precios por Producto");
        System.out.println("[4]. Devolver Producto");
        System.out.println("[5]. Salir ");
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

    private static void solicitarNombreProducto(String estado) {
        System.out.println("Escriba el nombre del Producto a " + estado + ": ");
    }

    private static String capturarDatoString() {
        return dato.nextLine();
    }

    private static boolean evaluarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                consultarTodos();
                comprar();
                return false;
            case 2:
                consultarTodos();
                return false;
            case 3:
                consultarPrecio();
                return false;
            case 4:
                devolver();
                return false;
            case 5:
                System.out.println("Ha sido un gusto atenderlo " + nombre + " " + apellidos + ". Hasta pronto...\n\n");
                return true;
            default:
                System.out.println("Opción incorrecta");
        }
        return true;
    }

    private static void comprar() {
        solicitarNombreProducto("comprar");
        nombreProducto = capturarDatoString();
        if (nombreProducto.equals(p1)) {
            imprimirProductoComprar(p1);
        } else if (nombreProducto.equals(p2)) {
            imprimirProductoComprar(p2);
        } else if (nombreProducto.equals(p3)) {
            imprimirProductoComprar(p3);
        } else if (nombreProducto.equals(p4)) {
            imprimirProductoComprar(p4);
        } else if ((nombreProducto.compareTo(p1) != 0) && (nombreProducto.compareTo(p2) != 0) && (nombreProducto.compareTo(p3) != 0) && (nombreProducto.compareTo(p4) != 0)) {
            System.out.println("\nProducto no Disponible para la venta en nuestra droguería!");
        }
    }

    private static void consultarTodos() {
        imprimir(1,p1,c1,pr1);
        imprimir(2,p2,c2,pr2);
        imprimir(3,p3,c3,pr3);
        imprimir(4,p4,c4,pr4);
    }

    private static void consultarPrecio(){
        solicitarNombreProducto("consultar precio");
        nombreProducto = capturarDatoString();
        if (nombreProducto.equals(p1)) {
            imprimirProductoPrecio(p1,pr1);
        } else if (nombreProducto.equals(p2)) {
            imprimirProductoPrecio(p2,pr2);
        } else if (nombreProducto.equals(p3)) {
            imprimirProductoPrecio(p3,pr3);;
        } else if (nombreProducto.equals(p4)) {
            imprimirProductoPrecio(p4,pr4);;
        } else if ((nombreProducto.compareTo(p1) != 0) && (nombreProducto.compareTo(p2) != 0) && (nombreProducto.compareTo(p3) != 0) && (nombreProducto.compareTo(p4) != 0)) {
            System.out.println("\nProducto no Disponible para la consulta de inventario en nuestra droguería!");
        }
    }

    private static void devolver(){
        solicitarNombreProducto("consultar precio");
        nombreProducto = capturarDatoString();
        if (nombreProducto.equals(p1)) {
            imprimirProductoDevuelto(p1);
        } else if (nombreProducto.equals(p2)) {
            imprimirProductoDevuelto(p2);
        } else if (nombreProducto.equals(p3)) {
            imprimirProductoDevuelto(p3);
        } else if (nombreProducto.equals(p4)) {
            imprimirProductoDevuelto(p4);
        } else if ((nombreProducto.compareTo(p1) != 0) && (nombreProducto.compareTo(p2) != 0) && (nombreProducto.compareTo(p3) != 0) && (nombreProducto.compareTo(p4) != 0)) {
            System.out.println("\nEl Producto no Pertenece al Inventario de nuestra droguería!");
        }
    }

    private static void imprimir(int n, String productoConsulta, String caracteristica, double precio ){
        System.out.println("Producto" + n + ": " + productoConsulta);
        System.out.println("Características: " + caracteristica);
        System.out.println("Precio: " + precio);
    }

    private static void imprimirProductoComprar(String productoComprar){
        System.out.println(nombre + " " + apellidos + " se ha registrado la compra de " + productoComprar + " a su nombre");
    }

    private static void imprimirProductoPrecio(String productoPrecio, double precio){
        System.out.println("El precio del producto " + productoPrecio + " es " + precio + " pesos");
    }

    private static void imprimirProductoDevuelto(String productoDevuelto){
        System.out.println("El producto " + productoDevuelto + " ha sido devuelto a nuestros inventarios ");
    }

}


