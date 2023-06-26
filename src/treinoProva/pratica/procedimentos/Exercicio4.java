package treinoProva.pratica.procedimentos;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String texto;

        System.out.println("Informe o texto: ");
        texto = scan.nextLine();

        texto.replace('.', ' ');
        String [] novoTexto = texto.split(" ");

        for (int i = 0; i < novoTexto.length; i++) {
            System.out.println(novoTexto[i]);
        }

    }
}
