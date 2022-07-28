import java.util.Locale;
import java.util.Scanner;

public class ExercicioSequencial2 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do raio do círculo: ");
        double raio = sc.nextDouble();

        double area = 3.14159*(raio*raio);

        System.out.printf("A=%.4f", area);

        sc.close();
    }
}

