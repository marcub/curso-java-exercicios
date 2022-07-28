package application;

import javax.sound.midi.SysexMessage;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        Locale.setDefault(Locale.US);

        Scanner input = new Scanner(System.in);

        System.out.print("Quantos números serão digitados? ");
        int n = input.nextInt();
        double[] vet = new double[n];
        double soma = 0;

        for (int i = 0; i<vet.length; i++) {
            System.out.print("Digite um número: ");
            vet[i] = input.nextDouble();
            soma = soma + vet[i];
        }

        double media = soma/ vet.length;

        System.out.print("\nVALORES = ");
        for (int l = 0; l<vet.length; l++) {
            System.out.printf("%.1f ", vet[l]);
        }
        System.out.printf("\nSOMA = %.2f", soma);
        System.out.printf("\nMEDIA = %.2f", media);

        input.close();
    }
}
