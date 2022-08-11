package application;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        List<Shape> shapeList = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int numShapes = input.nextInt();
        input.nextLine();

        for (int i = 0; i<numShapes; i++) {
            System.out.printf("Shape #%d data:", i+1);
            System.out.print("Rectangle or Circle (r/c)? ");
            char shapeChoice = input.next().charAt(0);
            input.nextLine();
            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(input.nextLine());
            if (shapeChoice == 'r') {
                System.out.print("Width: ");
                double width = input.nextDouble();
                System.out.print("Height: ");
                double height = input.nextDouble();
                Shape shape = new Rectangle(color, width, height);
                shapeList.add(shape);
            } else {
                System.out.print("Radius: ");
                double radius = input.nextDouble();
                Shape shape = new Circle(color, radius);
                shapeList.add(shape);
            }
        }

        System.out.println("\nSHAPE AREAS:");
        for (Shape x : shapeList) {
            System.out.printf("%.2f\n", x.area());
        }
        input.close();
    }
}
