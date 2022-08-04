package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yy");
        Locale.setDefault(Locale.US);

        Scanner input = new Scanner(System.in);
        List<Product> productList = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int numProduct = input.nextInt();
        input.nextLine();

        for (int i = 0; i<numProduct; i++) {
            System.out.printf("Product #%d data:", i+1);
            System.out.print("Common, used or imported (c/u/i)? ");
            int condition = input.next().charAt(0);
            input.nextLine();
            System.out.print("Name: ");
            String name = input.nextLine();
            System.out.print("Price: ");
            Double price = input.nextDouble();
            input.nextLine();
            if (condition == 'c') {
                Product product = new Product(name, price);
                productList.add(product);
            } else if (condition == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                Date date = format.parse(input.nextLine());
                Product product = new UsedProduct(name, price, date);
                productList.add(product);
            } else {
                System.out.print("Customs fee: ");
                double customFee = input.nextDouble();
                Product product = new ImportedProduct(name, price, customFee);
                productList.add(product);
            }
        }

        System.out.println("\nPRICE TAGS: ");
        for (Product x : productList) {
            System.out.println(x.priceTag());
        }
        input.close();
    }
}
