import java.util.Locale;
import java.util.Scanner;

public class ExercicioRepetitiva6 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        int n;
        double a, b, c, media;

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            a = sc.nextDouble();
            b = sc.nextDouble();
            c = sc.nextDouble();

            media = (a * 2 + b * 3 + c * 5) / (2 + 3 + 5);

            System.out.printf("%.1f\n", media);
        }
        sc.close();
    }
}
