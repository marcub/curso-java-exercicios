package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner input = new Scanner(System.in);

        System.out.print("Quantos números serão digitados? ");
        int n = input.nextInt();

        double[] numReais = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            numReais[i] = input.nextDouble();
        }

        double maiorNum = 0;
        int posicaoMaior = 0;

        for (int l = 0; l < n; l++) {
            if (maiorNum < numReais[l]) {
                maiorNum = numReais[l];
                posicaoMaior = l;
            }
        }

        System.out.printf("\nMAIOR VALOR = %.1f\n", maiorNum);
        System.out.printf("POSIÇÃO DO MAIOR VALOR = %d", posicaoMaior);

        input.close();
    }
}
