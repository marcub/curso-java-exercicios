package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter file full path: ");
        String path = input.nextLine();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))){
            String fields = bufferedReader.readLine();
            Map<String, Integer> votes = new HashMap<>();
            while (fields != null) {
                String[] data = fields.split(",");
                int sum = 0;
                if (votes.get(data[0]) != null) {
                    sum = votes.get(data[0]);
                }
                votes.put(data[0], Integer.parseInt(data[1]) + sum);
                fields = bufferedReader.readLine();
            }
            for(String e : votes.keySet()) {
                System.out.println(e + ": " + votes.get(e));
            }
        }
        catch(IOException e) {
            e.printStackTrace();
        }
        input.close();
    }
}
