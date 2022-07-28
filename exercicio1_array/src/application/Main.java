package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        Locale.setDefault(Locale.US);

        Scanner input = new Scanner(System.in);

        System.out.print("Quantos números serão digitados? ");
        int n = input.nextInt();
        int[] vet = new int[n];

        for (int i = 0; i< vet.length; i++) {
            System.out.print("Digite um número: ");
            vet[i] = input.nextInt();
        }

        System.out.println("NUMEROS NEGATIVOS: ");
        for (int l = 0; l< vet.length; l++) {
            if (vet[l] < 0) {
                System.out.println(vet[l]);
            }
        }

        input.close();
    }
}
