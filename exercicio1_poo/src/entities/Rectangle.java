package entities;

public class Rectangle {

    public double width;
    public double height;

    public double getArea () {
        return width * height;
    }

    public double getPerimeter () {
        return 2 * width + 2 * height;
    }

    public double getDiagonal () {
        return Math.sqrt(width * width + height * height);
    }
}
