package application;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner input = new Scanner(System.in);

        System.out.print("Quantos alunos serão digitados? ");
        int n = input.nextInt();
        input.nextLine();

        Student[] student = new Student[n];

        for (int i = 0; i < student.length; i++) {
            System.out.printf("Digite nome, primeira e segunda nota do %do aluno:\n", i + 1);
            String name = input.nextLine();
            double firstGrade = input.nextDouble();
            double secondGrade = input.nextDouble();
            input.nextLine();
            student[i] = new Student(name, firstGrade, secondGrade);
        }

        System.out.println("Alunos aprovados:");
        for (int j = 0; j < student.length; j++) {
            if (student[j].averageGrade() >= 6) {
                System.out.println(student[j].getName());
            }
        }

        input.close();
    }
}
