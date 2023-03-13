package FaculdadeSenac;

import java.util.Scanner;

public class TikTakToe {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String player1;
        String player2;

        String symbolPlayer1 = "X";
        String symbolPlayer2 = "O";

        System.out.print("Enter your name: ");
        player1 = scan.nextLine();
        System.out.println("Your name is: " + player1 + "\n");

        System.out.print("Second player name: ");
        player2 = scan.nextLine();
        System.out.println("Name of second player is: " + player2 + "\n");

        System.out.println("1 2 3");
        System.out.println("4 5 6");
        System.out.println("7 8 9");

        System.out.println(player1 + ", escolha a linha para marcar um " + symbolPlayer1 + ".");
        System.out.println("Line 1, 2, 3");
        symbolPlayer1 = scan.nextLine();


        System.out.println(player1 + ", ecolha a coluna para marcar um " + symbolPlayer1 + ".");
        System.out.println("Colum 1, 4, 7");
        symbolPlayer1 = scan.nextLine();

    }
}
