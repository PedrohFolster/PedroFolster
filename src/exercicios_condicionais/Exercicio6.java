package exercicios_condicionais;

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String time1;
        String time2;

        int golsTime1;
        int golsTime2;

        System.out.println("Insira o nome do primeiro time!");
        time1 = scan.nextLine();

        System.out.println("Insira o nome do segundo time!");
        time2 = scan.nextLine();

        System.out.println("Quantos gols o " + time1 + " marcou?");
        golsTime1 = scan.nextInt();

        System.out.println("Quantos gols o " + time1 + " marcou?");
        golsTime2 = scan.nextInt();

        if (golsTime1 == golsTime2) {
            System.out.println("Houve um empate! O " + time1 + " marcou a mesma quantidade de gols que o time " + time2 + "!");
            System.out.println("O jogo acabou em " + golsTime1 + " x " + golsTime2 + "!");
        } else {
            if (golsTime1 > golsTime2) {
                System.out.println("O " + time1 + " foi o vencedor com " + golsTime1 + " gols!");
            } else {
                System.out.println("O " + time2 + " foi o vencedor com " + golsTime2 + " gols!");
            }
        }
    }
}
