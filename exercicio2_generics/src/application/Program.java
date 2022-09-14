package application;

import entities.Product;
import service.CalculationService;

import javax.sound.sampled.Port;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        String path = "C:\\Users\\marcu\\OneDrive\\Área de Trabalho\\teste.txt";
        List<Product> list = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while(line != null) {
                String[] info = line.split(",");
                String name = info[0];
                Double price = Double.parseDouble(info[1]);
                list.add(new Product(name, price));
                line = br.readLine();
            }

            System.out.println("Most expensive: ");
            System.out.print(CalculationService.max(list));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

}
