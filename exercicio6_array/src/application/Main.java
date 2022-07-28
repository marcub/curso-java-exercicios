package application;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Quantos valores vai ter cada vetor? ");
        int n = input.nextInt();

        int[] vetorA = new int[n];
        int[] vetorB = new int[n];
        int[] vetorC = new int[n];

        System.out.println("Digite os valores do vetor A:");
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = input.nextInt();
        }

        System.out.println("Digite os valores do vetor B:");
        for (int l = 0; l < vetorA.length; l++) {
            vetorB[l] = input.nextInt();
        }

        System.out.println("VETOR RESULTANTE:");
        for (int j = 0; j < vetorA.length; j++) {
            vetorC[j] = vetorA[j] + vetorB[j];
            System.out.println(vetorC[j]);
        }

        input.close();
    }
}
