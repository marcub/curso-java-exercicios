package application;

import entities.Comida;
import entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class Jantar {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner input = new Scanner(System.in);

        System.out.print("Qual o nome da pessoa? ");
        String nome = input.nextLine();
        System.out.print("Qual o peso dela? ");
        double peso = input.nextDouble();
        input.nextLine();

        Pessoa pessoa = new Pessoa(nome, peso);

        System.out.print("O que ela comeu? ");
        nome = input.nextLine();
        System.out.print("Qual o peso da comida? ");
        peso = input.nextDouble();
        input.nextLine();

        Comida comida = new Comida(nome, peso);

        pessoa.comer(comida);

        System.out.printf("\nO peso atual da pessoa é de %.2fkg", pessoa.getPeso());

        input.close();
    }

}
