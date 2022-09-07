package application;

import entities.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        List<Product> productList = new ArrayList<>();

        String pathFileRead = "C:\\Users\\marcu\\OneDrive\\Área de Trabalho\\read_write\\products.csv";

        File file = new File(pathFileRead);

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String productLine = br.readLine();
            while (productLine != null) {
                String[] infos = productLine.split(",");
                Product product = new Product(infos[0], Double.parseDouble(infos[1]), Integer.parseInt(infos[2]));
                productList.add(product);
                productLine = br.readLine();
                System.out.println(product);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        String pathFileWrite = "C:\\Users\\marcu\\OneDrive\\Área de Trabalho\\read_write\\summary.csv";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(pathFileWrite))) {
            for(Product product : productList) {
                String line = product.getName() + ", " + String.format("%.2f", product.totalPrice());
                bw.write(line);
                bw.newLine();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}
