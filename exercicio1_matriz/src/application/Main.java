package application;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Qual tamanho da matriz? ");
        int n = input.nextInt();
        input.nextLine();

        int[][] matriz = new int[n][n];
        int numeroNegativo = 0;

        for(int i = 0; i<n; i++) {
            for(int l = 0; l<n; l++) {
                matriz[i][l] = input.nextInt();
                if (matriz[i][l] < 0) {
                    numeroNegativo++;
                }
            }
            input.nextLine();
        }

        System.out.println("\nDiagonal principal:");
        for(int i = 0; i<n; i++) {
            for(int l = 0; l<n; l++) {
                if (i == l) {
                    System.out.print(matriz[i][l] + " ");
                }
            }
        }

        System.out.printf("\nNúmeros negativos = %d", numeroNegativo);
        input.close();
    }
}
