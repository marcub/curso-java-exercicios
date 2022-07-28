import java.util.Locale;
import java.util.Scanner;

public class ExercicioCondicional6 {

    public static void main(String[] args) {

        double a;

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        a = sc.nextDouble();

        if (a >= 0 && a <= 25) {
            System.out.println("Intervalo [0,25]");
        } else if (a >= 0 && a <= 50) {
            System.out.println("Intervalo (25,50]");
        } else if (a >= 0 && a <= 75) {
            System.out.println("Intervalo (50,75]");
        } else if (a >= 0 && a <= 100) {
            System.out.println("Intervalo (75,100]");
        } else {
            System.out.println("Fora do intervalo");
        }
    }
}
