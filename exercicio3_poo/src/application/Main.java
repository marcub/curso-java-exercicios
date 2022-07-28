package application;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        Locale.setDefault(Locale.US);

        Scanner input = new Scanner(System.in);
        Student student = new Student();

        System.out.print("Name: ");
        student.name = input.nextLine();
        System.out.print("First grade: ");
        student.firstGrade = input.nextDouble();
        System.out.print("Second grade: ");
        student.secondGrade = input.nextDouble();
        System.out.print("Third grade:");
        student.thirdGrade = input.nextDouble();

        System.out.printf("\nFINAL GRADE = %.2f\n", student.getFinalGrade());
        System.out.println(student.studentSituation());

        input.close();
    }
}
