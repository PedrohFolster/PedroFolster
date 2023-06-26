package treinoProva.pratica.procedimentos;

import java.util.Scanner;

public class Exemplo1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int idade;

        System.out.print("Informe sua idade: ");
        idade = scan.nextInt();

        System.out.println("Você está na categoria: " + receberCategoria(idade));
    }

    public static String receberCategoria(int idade) {
        String categoria = null;
        String mirim = "mirim", infantil = "infantil", juvenil = "juvenil", adulto = "adulto";

        if (idade <= 10) {
            categoria = mirim;
        } else if (idade <= 14) {
            categoria = infantil;
        } else if (idade <= 19) {
            categoria = juvenil;
        } else if (idade > 19) {
            categoria = adulto;
        }
        return categoria;
    }
}
