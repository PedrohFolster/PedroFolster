package exercicios;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int number;

        System.out.println("Enter your number: ");
        number = scan.nextInt();
        System.out.println("Your number is: " + number);

        System.out.println("The predecessor of this number is: " + (--number));
        System.out.println("The successor of that number is: " + (++number + 1));
    }
}
