import java.util.Scanner;

public class ExercicioCondicional3 {

    public static void main(String[] args) {

        int a, b;

        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();

        if (a >= b) {
            if (a % b == 0) {
                System.out.println("Sao multiplos");
            }
            else {
                System.out.println(("Nao sao multiplos"));
            }
        }
        else {
            if (b % a == 0) {
                System.out.println("Sao multiplos");
            }
            else {
            System.out.println(("Nao sao multiplos"));
            }
        }
    }

}
