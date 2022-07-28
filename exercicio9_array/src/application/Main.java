package application;

import entities.Person;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = input.nextInt();

        Person[] person = new Person[n];
        int indexOlder = 0;
        int biggerAge = 0;

        for (int i = 0; i < person.length; i++) {
            System.out.printf("Dados da %da pessoa:\n", i + 1);
            System.out.print("Nome: ");
            String name = input.next();
            System.out.print("Idade: ");
            int age = input.nextInt();

            person[i] = new Person(name, age);

            if (person[i].getAge() > biggerAge) {
                biggerAge = person[i].getAge();
                indexOlder = i;
            }
        }

        System.out.printf("PESSOA MAIS VELHA: %s", person[indexOlder].getName());

        input.close();
    }

}
