import java.util.Locale;
import java.util.Scanner;

public class ExercicioRepetitiva2 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        double x, y;

        Scanner sc = new Scanner(System.in);
        x = sc.nextDouble();
        y = sc.nextDouble();

        while (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("primeiro");
                x = sc.nextDouble();
                y = sc.nextDouble();
            } else if (x < 0 && y > 0) {
                System.out.println("segundo");
                x = sc.nextDouble();
                y = sc.nextDouble();
            } else if (x < 0 && y < 0) {
                System.out.println("terceiro");
                x = sc.nextDouble();
                y = sc.nextDouble();
            } else {
                System.out.println("quarto");
                x = sc.nextDouble();
                y = sc.nextDouble();
            }
        }

        sc.close();

    }
}
