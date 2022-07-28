package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner input = new Scanner(System.in);

        System.out.print("Quantos elementos vão ter o vetor? ");
        int n  = input.nextInt();

        int[] vetor = new int[n];
        int sumPares = 0;
        int numPares = 0;


        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = input.nextInt();

            if (vetor[i] % 2 == 0) {
                sumPares += vetor[i];
                numPares++;
            }
        }

        if (numPares == 0) {
            System.out.print("NENHUM NUMERO PAR");
        } else {
            double mediaPares = (double) sumPares / numPares;
            System.out.printf("MEDIA DOS PARES = %.1f", mediaPares);
        }
        input.close();
    }
}
