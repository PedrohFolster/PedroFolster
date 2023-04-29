package treinoProva;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int contador = 0;
        int quantidadeFilhos;
        int quantidadeHabitantes = 0;
        double salario;
        String alternativa;
        double totalSalario = 0;
        double totalQuantidadeFilhos = 0;
        double maiorSalario = Double.NEGATIVE_INFINITY;
        double habitantesComSalarioMenorQue1000 = 0;

        do {
            quantidadeHabitantes++;
                contador++;
                System.out.println();
                System.out.print("Insira as informações sobre o " + contador + "° habitante.");
                System.out.println();

                System.out.print("Informe o seu salário: ");
                salario = scan.nextDouble();

                System.out.print("Insira a quantidade de filhos que você tem: ");
                quantidadeFilhos = scan.nextInt();

                totalSalario += salario;
                totalQuantidadeFilhos += quantidadeFilhos;

                if (maiorSalario < salario) {
                    maiorSalario = salario;
                }

                if (salario < 1000) {
                    habitantesComSalarioMenorQue1000++;
                }

            double mediaSalario = totalSalario / quantidadeHabitantes;
            double mediaNumeroFilhos = totalQuantidadeFilhos / quantidadeHabitantes;
            double percentualSalarioMenorQue1000 = habitantesComSalarioMenorQue1000 / quantidadeHabitantes * 100;


            System.out.println("Você deseja informar mais um habitante?\n" +
                    "S - Sim, desejo informar mais um habitante!\n" +
                    "N - Não, desejo finalizar!");
            alternativa = scan.next();

            if (alternativa.equalsIgnoreCase("N")) {
                System.out.println("A média de salário da população é de: " + mediaSalario);
                System.out.println("A média de filhos da população é de: " + mediaNumeroFilhos);
                System.out.println("O maior salário da população é de: " + maiorSalario);
                System.out.println("O percentual de salários abaixo de R$ 1000 é de: " + percentualSalarioMenorQue1000 + "%");
                break;
            }

        } while (quantidadeHabitantes > contador || alternativa.equalsIgnoreCase("S"));

    }
}
