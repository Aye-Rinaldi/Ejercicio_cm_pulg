package ar.com.xeven;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //ejercicio1: crear un sistema que convierta cm en pulgadas
        Scanner sc = new Scanner(System.in);
        int cm;
        double pulgadas;
        System.out.println("Convertir Centimetros a Pulgadas.");
        do {
            System.out.print("Introduce centimetros (0 para finalizar): ");
            cm = sc.nextInt();

            if (cm != 0) {
                pulgadas = cm * 2.5;
                System.out.printf("%d millas equivalen a %.2f pulgadas %n", cm, pulgadas);

            }

        } while (cm != 0);
    }

}

