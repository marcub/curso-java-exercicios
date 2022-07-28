import java.util.Scanner;

public class ExercicioRepetitiva5 {

    public static void main(String[] args) {
        int n, x, in = 0, out = 0;

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            x = sc.nextInt();
            if (x >= 10 && x <= 20){
                in++;
            } else {
                out++;
            }
        }

        System.out.println(in + " in");
        System.out.println((out + " out"));
    }
}
