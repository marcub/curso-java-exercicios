package application;

import entities.Client;

public class Program {
    public static void main(String[] args) {

        Client firstClient = new Client("Maria", "maria@gmail.com");
        Client secondClient = new Client("Alex", "alex@gmail.com");

        if (firstClient.hashCode() == secondClient.hashCode()) {
            if (firstClient.equals(secondClient)) {
                System.out.println("They are equals");
            }
            else {
                System.out.println("They are different");
            }
        }
        else {
            System.out.println("They are different");
        }

        System.out.println(firstClient == secondClient); //Comparação por referência, não conteúdo!
    }
}
