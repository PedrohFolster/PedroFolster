package treinoProva.pratica.procedimentos;

import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String nome;

        System.out.print("Informe seu nome: ");
        nome = scan.nextLine();

        String[] nomeEmLinhas = nome.trim().split(" ");

        String sobrenome = nomeEmLinhas[nomeEmLinhas.length - 1];

        StringBuilder nomeFormatado = new StringBuilder(sobrenome + ", ");
        for (int i = 0; i < nomeEmLinhas.length - 1; i++) {
            nomeFormatado.append(nomeEmLinhas[i]).append(" ");
        }

        System.out.println(nomeFormatado.toString().trim());
    }
}
