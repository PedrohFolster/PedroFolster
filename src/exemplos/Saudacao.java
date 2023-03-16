package exemplos;

import java.util.Scanner;

public class Saudacao {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String message;

        System.out.println("Enter your message: ");
        message = scan.nextLine();

        System.out.print("Your message is: " + message);
    }
}
