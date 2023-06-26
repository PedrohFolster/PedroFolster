package treinoProva.pratica.procedimentos;

import java.util.Scanner;

public class Exercicio11Novo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] numeroPorExtenso = {"", "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        String dia;

        System.out.print("Informe a data de seu nascimento seguindo o exemplo (MM/DD/AAAA): ");
        dia = scan.nextLine();

        String [] separar = dia.split("/");

        int mes = Integer.parseInt(separar[1]);
        int ano = Integer.parseInt(separar[2]);

        System.out.println(separar[0] + " de " + numeroPorExtenso[mes] + " de " + ano);

    }
}
