import java.util.Scanner;

public class ExercicioRepetitiva4 {

    public static void main(String[] args) {
        int x;

        Scanner sc = new Scanner (System.in);

        x = sc.nextInt();

        for (int i = 1; i < x; i++) {

            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
