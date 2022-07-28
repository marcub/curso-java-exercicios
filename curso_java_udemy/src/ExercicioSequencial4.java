import java.util.Locale;
import java.util.Scanner;

public class ExercicioSequencial4 {

    public static void main(String[] args) {
        int number, hourWork;
        double valueHour, salary;

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Number: ");
        number = sc.nextInt();
        System.out.print("Hours: ");
        hourWork = sc.nextInt();
        System.out.print("Value per hour: ");
        valueHour = sc.nextDouble();

        salary = hourWork * valueHour;

        System.out.printf("NUMBER = " + number + "\n");
        System.out.printf("SALARY = U$ %.2f\n", salary);

        sc.close();
    }
}

