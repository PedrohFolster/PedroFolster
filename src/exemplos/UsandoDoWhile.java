package exemplos;

import java.util.Scanner;

public class UsandoDoWhile {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int contador = 1, mediaComparacoes;
        String nome;
        double nota1, nota2, media;


        System.out.println("Insira quantas vezes você deseja obter essas médias: ");
        mediaComparacoes = scan.nextInt();

        do {
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
        } while (contador <= mediaComparacoes);
    }
}
