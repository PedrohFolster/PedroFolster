package exemplos;

import java.util.Scanner;

public class Saudacao {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String name;

        System.out.println("Enter your name: ");
        name = scan.nextLine();
        System.out.print("\nYour name is: " + name);

    }
}
