package application;

import entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

        System.out.println("Enter rectangle measures: ");
        System.out.print("Width - ");
        rectangle.width = sc.nextDouble();
        System.out.print("Height - ");
        rectangle.height = sc.nextDouble();

        System.out.printf("AREA = %.2f\n", rectangle.getArea());
        System.out.printf("PERIMETER = %.2f\n", rectangle.getPerimeter());
        System.out.printf("DIAGONAL = %.2f\n", rectangle.getDiagonal());

        sc.close();

    }
}
