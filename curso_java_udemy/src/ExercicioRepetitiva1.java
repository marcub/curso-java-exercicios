import java.util.Scanner;

public class ExercicioRepetitiva1 {

    public static void main(String[] args) {

        int senhaCorreta = 2002, senha = 0;

        Scanner sc = new Scanner (System.in);
        senha = sc.nextInt();

        while (senhaCorreta != senha) {
            System.out.println("Senha Invalida");
            senha = sc.nextInt();
        }
        System.out.println("Acesso Permitido");
    }
}
