
import java.util.Scanner;

public class ExercicioRepetitiva3 {

    public static void main(String[] args) {

        int combustivel, gasolina = 0, alcool = 0, diesel = 0;

        do {

            Scanner sc = new Scanner(System.in);

            combustivel = sc.nextInt();

            if (combustivel == 1) {
                alcool ++;
            } else if (combustivel == 2) {
                gasolina ++;
            } else if (combustivel == 3) {
                diesel++;
            }
        } while (combustivel != 4);

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
    }
}
