package application;

import entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();
        String path = "C:\\Users\\marcu\\OneDrive\\Área de Trabalho\\names.csv";

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            String dataLine = br.readLine();
            while (dataLine != null) {
                String[] auxArray = dataLine.split(",");
                Employee employee = new Employee(auxArray[0], Double.parseDouble(auxArray[1]));
                employeeList.add(employee);
                dataLine = br.readLine();
            }

            Collections.sort(employeeList);

            for (Employee e : employeeList) {
                System.out.println(e);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

}
