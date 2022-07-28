import java.util.Scanner;

public class ExercicioCondicional1 {

    public static void main(String[] args) {

        int a;

        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();

        if (a >= 0) {
            System.out.println("NAO NEGATIVO");
        }
        else {
            System.out.println("NEGATIVO");
        }
    }
}
