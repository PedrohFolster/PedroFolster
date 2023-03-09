package FaculdadeSenac;

import java.util.Scanner;

public class NameAndYears {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int idade;
        String name;

            System.out.println("\nNome: ");
            name = scan.nextLine();

            System.out.println("\nIdade: ");
            idade = scan.nextInt();

            System.out.println("\nNome: " + name + "." + "\nIdade: " + idade + " anos.");

    }
}
