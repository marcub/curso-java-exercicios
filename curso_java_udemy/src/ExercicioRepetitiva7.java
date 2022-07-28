import java.util.Locale;
import java.util.Scanner;

public class ExercicioRepetitiva7 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        int n;
        double a, b, divisao;

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        for (int i = 0; i < n ; i++) {

            a = sc.nextDouble();
            b = sc.nextDouble();

            if (b == 0) {
                System.out.println("divisao impossivel");
            } else {
                divisao = a / b;
                System.out.println(divisao);
            }
        }
    }
}
