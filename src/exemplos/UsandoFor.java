package exemplos;

import java.util.Scanner;

public class UsandoFor {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int mediaComparacoes;
        String nome;
        double nota1, nota2, media;

        System.out.print("Insira quantas vezes você deseja obter essas médias: ");
        mediaComparacoes = scan.nextInt();

        for (int contador = 1; contador <= mediaComparacoes; contador ++) {

            System.out.print("\nAluno " + contador + "\nInsira seu nome: ");
            nome = scan.next();
            scan.nextLine();

            System.out.print("Insira a nota da primeira avaliação: ");
            nota1 = scan.nextDouble();

            System.out.print("Insira a nota da segunda avaliação: ");
            nota2 = scan.nextDouble();

            media = (nota1 + nota2) / 2;
            System.out.println(nome + ", sua média é de: " + media);

            contador ++;
            scan.nextLine();
        }
    }
}