package Taller2Java;

import java.util.Scanner;
public class Ejercicio2 {
    private int edad;

    public void Ejercicio2(){
        solicitarEdad();
        edad = capturarDato();
        validarEdad(edad);
    }

    private void solicitarEdad(){
        System.out.println("Digite la edad: ");
    }
    private int capturarDato(){
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    private void validarEdad(int edad){
        if(edad < 18){
            System.out.println("Usted es aun un niño");
        }
    }
}
