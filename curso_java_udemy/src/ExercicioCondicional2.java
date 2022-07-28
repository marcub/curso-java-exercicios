import java.util.Scanner;

public class ExercicioCondicional2 {

    public static void main(String[] args) {

        int a;

        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();

        if (a % 2 == 0) {
            System.out.println("PAR");
        }
        else {
            System.out.println("IMPAR");
        }

    }
}
