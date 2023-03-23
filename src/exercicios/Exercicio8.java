package exercicios;

import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double salario;
        double reajusteDoSalario;

        System.out.print("Qual o seu salário? ");
        salario = scan.nextDouble();

        System.out.println("Seu salário é: " + salario);

        System.out.print("Escolha uma porcentagem para um reajuste salarial: ");
        reajusteDoSalario = scan.nextDouble();
        System.out.println(reajusteDoSalario + "%");

        double valorSalario = salario;
        double porcentagem = reajusteDoSalario / 100;


        double resultado = salario + (salario * porcentagem);


        System.out.println("Valor do salário: " + resultado);
    }
}
