package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner input = new Scanner(System.in);

        System.out.print("Quantos elementos vão ter o vetor? ");
        int n = input.nextInt();

        double[] vetor = new double[n];
        double somaVetor = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = input.nextDouble();
            somaVetor += vetor[i];
        }

        double mediaVetor = somaVetor/vetor.length;

        System.out.printf("\nMEDIA DO VETOR = %.3f\n", mediaVetor);

        System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
        for (int j = 0; j < vetor.length; j++) {
            if (vetor[j] < mediaVetor) {
                System.out.printf("%.1f\n", vetor[j]);
            }
        }

        input.close();
    }
}
