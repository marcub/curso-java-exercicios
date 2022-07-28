package application;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Quantos números serão digitados? ");
        int n = input.nextInt();
        int[] vetores = new int[n];

        for (int i = 0; i < vetores.length; i++) {
            System.out.print("Digite um número: ");
            vetores[i] = input.nextInt();
        }

        int quantidadePares = 0;

        System.out.println("\nNÚMEROS PARES:");
        for (int l = 0; l < vetores.length; l++) {
            if (vetores[l] % 2 == 0) {
                quantidadePares++;
                System.out.printf("%d  ", vetores[l]);
            }
        }

        System.out.printf("\nQUANTIDADE DE PARES = %d", quantidadePares);

        input.close();

    }
}
