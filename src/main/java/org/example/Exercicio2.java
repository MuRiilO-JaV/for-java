package org.example;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N;

        System.out.println("Digite um numero: ");
        N = scanner.nextInt();

        int soma = 0;

        for(int i = 1; i<=N; ++i){

            soma+= i;

        }

        System.out.println("A soma dos de 1 até " + N +" é:"+soma);




    }
}
