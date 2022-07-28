import java.util.Locale;
import java.util.Scanner;

public class ExercicioSequencial5 {

    public static void main(String[] args) {
        int id1, id2, quantity1, quantity2;
        double unitPrice1, unitPrice2, total;

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        id1 = sc.nextInt();
        quantity1 = sc.nextInt();
        unitPrice1 = sc.nextDouble();

        id2 = sc.nextInt();
        quantity2 = sc.nextInt();
        unitPrice2 = sc.nextDouble();

        total = quantity1 * unitPrice1 + quantity2 * unitPrice2;

        System.out.printf("VALOR A PAGAR: %.2f\n", total);

        sc.close();
    }
}
