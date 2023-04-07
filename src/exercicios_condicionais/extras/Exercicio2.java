package exercicios_condicionais.extras;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double salarioBruto, salarioLiquido, inss;

        System.out.println("Informe o seu salário bruto: ");
        salarioBruto = scan.nextDouble();

        inss = salarioBruto * 0.1;
        salarioLiquido = salarioBruto - inss;
        double impostoRenda;

        if (salarioLiquido < 1000) {
            impostoRenda = salarioLiquido * 0.05;
        } else if (salarioLiquido >= 1000 && salarioLiquido <= 3000) {
            impostoRenda = salarioLiquido * 0.1;
        } else {
            impostoRenda = salarioLiquido * 0.2;
        }

        salarioLiquido -= impostoRenda;

        System.out.println("O seu salário líquido é: R$ " + salarioLiquido);


    }

}
