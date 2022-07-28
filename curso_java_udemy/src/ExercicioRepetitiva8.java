import java.util.Scanner;

public class ExercicioRepetitiva8 {

    public static void main(String[] args) {

        int n, fatorial = 1;

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            fatorial = fatorial * (n - i);
        }

        System.out.println(fatorial);
    }
}
