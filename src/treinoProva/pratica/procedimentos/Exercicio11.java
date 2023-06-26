package treinoProva.pratica.procedimentos;

import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String [] numeroPorExtenso = {"","Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        int dia, mes, ano;

        System.out.print("Informe o dia do seu nascimento: ");
        dia = scan.nextInt();

        System.out.print("Informe o mês do seu nascimento: ");
        mes = scan.nextInt();

        System.out.print("Informe o ano do seu nascimento: ");
        ano = scan.nextInt();

        String diaString = String.valueOf(dia);
        String mesString = String.valueOf(mes);
        String anoString = String.valueOf(ano);

        System.out.print(dia + " de ");

        for (int i = 0; i < mesString.length(); i++) {
            int digito = mesString.charAt(i) - '0';
            System.out.print(numeroPorExtenso[digito]);

            if (i < mesString.length() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" de " + ano);
        System.out.println();

    }
}