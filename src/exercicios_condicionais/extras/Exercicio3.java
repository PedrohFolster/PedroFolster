package exercicios_condicionais.extras;

import java.util.Calendar;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int ano;

        System.out.println("Insira um ano para verificar se é bissexto: ");
        ano = scan.nextInt();

        Calendar calendario = Calendar.getInstance();
        calendario.set(Calendar.YEAR, ano);
        if (calendario.getActualMaximum(Calendar.DAY_OF_YEAR) > 365) {
            System.out.println(ano + "é um ano bissexto!");
        } else {
            System.out.println("Não é um ano bissexto!");
        }
    }
}
