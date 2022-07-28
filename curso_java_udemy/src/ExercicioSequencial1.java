import java.util.Scanner;

public class ExercicioSequencial1 {

    public static void main(String[] args) {
        int soma;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite dois valores inteiros: ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        soma = x + y;

        System.out.printf("SOMA = " + soma);


    }
}
