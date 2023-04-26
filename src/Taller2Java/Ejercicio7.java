package Taller2Java;

import java.util.Scanner;
public class Ejercicio7 {
    private Scanner dato;
    private double peso, altura, IMC;
    private boolean salir = false;

    public void Ejercicio7(){
        dato = new Scanner(System.in);
        solicitarPeso();
        peso = capturarDato();
        solicitarAltura();
        altura = capturarDato();
        IMC = calcularIMC(peso, altura);
        interpretarIMC(IMC);
    }

    private double calcularIMC(double peso, double altura){
        return (peso / (altura*altura));
    }

    private void interpretarIMC(double IMC){
        if(IMC < 18.5){
            System.out.println("Señor(a) usted tiene Bajo peso");
        }else if(IMC >= 18.5 && IMC < 25){
            System.out.println("Señor(a) usted tiene un Peso normal");
        }else if(IMC >= 25 && IMC < 30){
            System.out.println("Señor(a) usted tiene Sobrepeso");
        }else{
            System.out.println("Señor(a) usted tine Obesidad ");
        }
    }

    private void solicitarPeso(){
        System.out.println("Digite su peso kilos");
    }

    private void solicitarAltura(){
        System.out.println("Digite su altura en metros");
    }

    private double capturarDato(){
        return dato.nextDouble();
    }
}

