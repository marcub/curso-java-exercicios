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

        Person[] person = new Person[n];
        double personUnderSix = 0;
        double sumHeight = 0;

        for (int i = 0; i < person.length; i++) {
            System.out.printf("Dados da %dª pessoa:\n", i+1);
            System.out.print("Name: ");
            String name = input.next();
            System.out.print("Age: ");
            int age = input.nextInt();
            if (age<16){
                personUnderSix += 1;
            }
            System.out.print("Height: ");
            double height = input.nextDouble();
            sumHeight += height;
            person[i] = new Person(name, age, height);
        }

        double averageHeight = sumHeight / person.length;
        double percentageUnderSix = (personUnderSix/person.length) * 100.0;

        System.out.printf("\nAverage height: %.2f\n", averageHeight);
        System.out.println("People less than 16 years: " + String.format("%.1f", percentageUnderSix) + "%");

        for (int l = 0; l<person.length; l++) {
            if (person[l].getAge() < 16) {
                System.out.println(person[l].getName());
            }
        }


        input.close();
    }
}
