import java.util.Scanner;

public class ExercicioCondicional4 {

    public static void main(String[] args) {

        int initialHour, finalHour, game;

        Scanner sc = new Scanner(System.in);

        initialHour = sc.nextInt();
        finalHour = sc.nextInt();

        if (initialHour < finalHour) {
            game = finalHour - initialHour;
        } else if (initialHour > finalHour) {
            game = (finalHour + 24) - initialHour;
        } else {
            game = 24;
        }

        System.out.printf("O JOGO DUROU %d HORA(S)", game);

        sc.close();
    }
}
