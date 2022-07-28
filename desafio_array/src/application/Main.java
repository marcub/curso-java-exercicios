package application;

import entities.Aluguel;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Aluguel[] aluguel = new Aluguel[10];

        for (int i = 0; i<10; i++) {
            aluguel[i] = new Aluguel(i);
        }

        System.out.print("Quantos quartos serão alugados? ");
        int n = input.nextInt();
        input.nextLine();

        for (int i = 0; i<n; i++) {
            System.out.printf("\nAluguel #%d:\n", i+1);
            System.out.print("Nome: ");
            String nome = input.nextLine();
            System.out.print("Email: ");
            String email = input.nextLine();
            System.out.print("Quarto: ");
            int quarto = input.nextInt();
            input.nextLine();

            for (int l = 0; l<10; l++) {
                if (aluguel[l].getQuarto() == quarto) {
                    aluguel[l].setNome(nome);
                    aluguel[l].setEmail(email);
                }
            }
        }

        System.out.println("\nQuartos alugados:");
        for (int i = 0; i<10; i++) {
            if (aluguel[i].getNome() != null) {
                System.out.println(aluguel[i]);
            }
        }

        input.close();
    }
}
