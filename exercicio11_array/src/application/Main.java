package application;

import entities.Person;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner input = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = input.nextInt();
        input.nextLine();

        Person person[] = new Person[n];

        for (int i = 0; i < person.length; i++) {
            System.out.printf("Altura da %dª pessoa: ", i + 1);
            double height = input.nextDouble();
            System.out.printf("Gênero da %dª pessoa: ", i + 1);
            char gender = input.next().charAt(0);
            input.nextLine();
            person[i] = new Person(height, gender);
        }

        double smaller = 30;
        double biggest = 0;
        double sumWomenHeight = 0;
        double numWomen = 0;
        double averageWomenHeight;
        int numMen = 0;

        for (int l = 0; l < person.length; l++) {
            if (person[l].getHeight() < smaller) {
                smaller = person[l].getHeight();
            }
            if (person[l].getHeight() > biggest) {
                biggest = person[l].getHeight();
            }
            if (person[l].getGender() == 'F') {
                sumWomenHeight += person[l].getHeight();
                numWomen++;
            }
            if (person[l].getGender() == 'M') {
                numMen++;
            }
        }

        averageWomenHeight = sumWomenHeight / numWomen;

        System.out.printf("Menor altura = %.2f\n", smaller);
        System.out.printf("Maior altura =  %.2f\n", biggest);
        System.out.printf("Média das alturas das mulheres = %.2f\n", averageWomenHeight);
        System.out.printf("Numero de homens = %d", numMen);

        input.close();

    }
}
