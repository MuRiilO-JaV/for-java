package org.example;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int Tabuada;

        System.out.println("Digite o numero da tabuada que deseja: ");
        Tabuada = scanner.nextInt();

        for(int i=1; i<=10; ++i){

            System.out.println(Tabuada + " x " + i + " = " + (Tabuada * i));

        }








    }
}
