package application;

import entities.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Enter full file path: ");
        String filePath = input.nextLine();
        List<Product> productList = new ArrayList<>();

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String lineContent = reader.readLine();
            while(lineContent != null) {
                String[] lineContentSeparated = lineContent.split(",");
                Product product = new Product(lineContentSeparated[0], Double.parseDouble(lineContentSeparated[1]));
                productList.add(product);
                lineContent = reader.readLine();
            }

            Double sum = productList.stream().map(x -> x.getPrice()).reduce(0.0, (x, y) -> x + y);
            Double averagePrice = sum / productList.size();

            System.out.print("Average price: $ " + String.format("%.2f", averagePrice));

            System.out.println();

            List<Product> productsUnderAveragePrice = productList.stream()
                    .filter(x -> x.getPrice() < averagePrice)
                    .sorted((x, y) -> -x.getName().toUpperCase().compareTo(y.getName().toUpperCase()))
                    .collect(Collectors.toList());
            productsUnderAveragePrice.forEach(x -> System.out.println(x.getName()));
        }
        catch (IOException e) {
            e.printStackTrace();
        }




        input.close();
    }
}
