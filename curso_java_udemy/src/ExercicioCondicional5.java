import java.util.Locale;
import java.util.Scanner;

public class ExercicioCondicional5 {

    public static void main(String[] args) {

        int id, quantity;
        double price = 0, total;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        id = sc.nextInt();
        quantity = sc.nextInt();

        if (id == 1) price = 4.0;
        else if (id == 2) price = 4.5;
        else if (id == 3) price = 5.0;
        else if (id == 4) price = 2.0;
        else if (id == 5) price = 1.5;

        total = price * quantity;

        System.out.printf("Total: R$ %.2f\n", total);

        sc.close();
    }
}
