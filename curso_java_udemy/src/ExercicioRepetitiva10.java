import java.util.Scanner;

public class ExercicioRepetitiva10 {

    public static void main(String[] args) {

        int n, quadrado, cubo;

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            quadrado = i * i;
            cubo = i * i * i;

            System.out.printf("%d %d %d\n", i, quadrado, cubo);
        }
    }
}
