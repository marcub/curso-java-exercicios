package application;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Rectangle(2.0,5.0));
        shapes.add(new Circle(4.0));

        System.out.println("Total area: " + totalArea(shapes));
    }

    public static double totalArea(List<? extends Shape> shapes) {
        double totalArea = 0;
        for(Shape e : shapes) {
            totalArea = totalArea + e.area();
        }
        return totalArea;
    }
}
