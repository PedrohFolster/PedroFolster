package repeticao;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String name;

        System.out.print("Enter your name: ");
        name = scan.nextLine();

        for (int i = 1; i <= 20; i++) {
            System.out.println("Name: " + name);
        }
    }
}
