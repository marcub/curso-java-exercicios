package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Set<Integer> students = new HashSet<>();

        System.out.print("How many students for course A? ");
        int num = input.nextInt();
        input.nextLine();
        for (int i = 0; i<num; i++) {
            int studentNumber = input.nextInt();
            input.nextLine();
            students.add(studentNumber);
        }

        System.out.print("How many students for course B? ");
        num = input.nextInt();
        input.nextLine();
        for (int i = 0; i<num; i++) {
            int studentNumber = input.nextInt();
            input.nextLine();
            students.add(studentNumber);
        }

        System.out.print("How many students for course C? ");
        num = input.nextInt();
        input.nextLine();
        for (int i = 0; i<num; i++) {
            int studentNumber = input.nextInt();
            input.nextLine();
            students.add(studentNumber);
        }

        System.out.print("Total students: " + students.size());
        input.close();
    }
}
