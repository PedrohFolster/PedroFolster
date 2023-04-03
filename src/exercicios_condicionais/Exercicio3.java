package exercicios_condicionais;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int horaInicio;
        int horaFinal;

        System.out.println("Insira somente a hora em que começou o jogo de Xadrez no formato de 24h! ");
        horaInicio = scan.nextInt();

        System.out.println("Agora insira somente a hora em que o jogo terminou no formato de 24h!");
        horaFinal = scan.nextInt();

        System.out.println("O jogo durou quantos dias? ");
        int dias = scan.nextInt();

        int totalHoras = (horaFinal - horaInicio);

        if (dias > 1) {
            System.out.println("O jogo não pode durar mais de um dia!");
        } else {
            System.out.println("O jogo foi considerado válido, visto que durou menos de um dia!");
        }
        if (totalHoras < 24) {
            System.out.println("O jogo durou menos que 24 horas, portanto é válido! O jogo durou: " + totalHoras);
        } else {
            System.out.println("O jogo durou mais do que 24 horas, portanto não foi validado! O jogo durou: " + totalHoras);
        }
    }
}
