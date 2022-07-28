package application;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o número de linhas na matriz: ");
        int m = input.nextInt();
        System.out.print("Digite o número de colunas na matriz: ");
        int n = input.nextInt();

        input.nextLine();

        int[][] matriz = new int[m][n];

        for(int i = 0; i<matriz.length; i++) {
            for(int l = 0; l<matriz[i].length; l++) {
                matriz[i][l] = input.nextInt();
            }
            input.nextLine();
        }

        System.out.print("Digite o número que quer verificar: ");
        int verifica = input.nextInt();

        for(int i = 0; i<matriz.length; i++) {
            for(int l = 0; l<matriz[i].length; l++) {
                if (verifica == matriz[i][l]) {
                    System.out.printf("Posição %d,%d:\n", i, l);
                    if (l-1 >= 0){
                        System.out.printf("Esquerda: %d\n", matriz[i][l-1]);
                    }
                    if (l+1 < matriz[i].length) {
                        System.out.printf("Direita: %d\n", matriz[i][l + 1]);
                    }
                    if (i-1 >= 0) {
                        System.out.printf("Acima: %d\n", matriz[i - 1][l]);
                    }
                    if (i+1 < matriz.length) {
                        System.out.printf("Abaixo: %d\n", matriz[i + 1][l]);
                    }
                }
            }
        }
        input.close();
    }
}
