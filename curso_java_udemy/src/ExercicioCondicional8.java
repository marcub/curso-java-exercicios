import java.util.Locale;
import java.util.Scanner;

public class ExercicioCondicional8 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        double salary, taxes;

        Scanner sc = new Scanner(System.in);

        salary = sc.nextDouble();

        if (salary >= 0 && salary <= 2000.00) {
            System.out.println("Isento");
        } else if (salary > 2000.00 && salary <= 3000.00) {
            taxes = (salary - 2000) * 0.08;
            System.out.printf("R$ %.2f\n", taxes);
        } else if (salary > 3000 && salary <= 4500) {
            taxes = 1000 * 0.08 + (salary - 3000) * 0.18;
            System.out.printf("R$ %.2f", taxes);
        } else {
            taxes = 1000 * 0.08 + 1500 * 0.18 + (salary - 4500) * 0.28;
            System.out.printf("R$ %.2f", taxes);
        }
    }
}
