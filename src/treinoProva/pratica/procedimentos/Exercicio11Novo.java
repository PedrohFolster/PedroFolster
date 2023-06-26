package treinoProva.pratica.procedimentos;

import java.util.Scanner;

public class Exercicio11Novo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String [] arrayMes = {"", "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        String dataNascimento;


        System.out.print("Informe sua data de nascimento seguindo o exemplo (DD/MM/AAAA): ");
        dataNascimento = scan.nextLine();

        String [] separar = dataNascimento.split("/");

        int mes = Integer.parseInt(separar[1]);
        int ano = Integer.parseInt(separar[2]);

        System.out.println(separar[0] + " de " + arrayMes[mes] + " de " + ano);

    }
}
