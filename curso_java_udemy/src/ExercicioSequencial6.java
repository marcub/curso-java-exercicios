import java.util.Locale;
import java.util.Scanner;

public class ExercicioSequencial6 {
    public static void main(String[] args) {

        double a, b, c;
        double areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;
        double pi = 3.14159;

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        areaTriangulo = (a * c)/2;
        areaCirculo = pi * c * c;
        areaTrapezio = ((a + b)* c)/2;
        areaQuadrado = b * b;
        areaRetangulo = a * b;

        System.out.printf("TRIANGULO: %.3f\n", areaTriangulo);
        System.out.printf("CIRCULO: %.3f\n", areaCirculo);
        System.out.printf("TRAPEZIO: %.3f\n", areaTrapezio);
        System.out.printf("QUADRADO: %.3f\n", areaQuadrado);
        System.out.printf("RETANGULO: %.3f\n", areaRetangulo);

        sc.close();
    }
}
