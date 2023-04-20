package lista_repeticao;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numHabitantes = 0;
        double salarioTotal = 0;
        double maiorSalario = 0;
        int filhosTotal = 0;
        int habitantesComSalarioMenorQue1000 = 0;

        String resposta;
        do {
            numHabitantes++;

            System.out.println("Digite o salário do habitante " + numHabitantes + ":");
            double salario = scan.nextDouble();
            salarioTotal += salario;

            if (salario > maiorSalario) {
                maiorSalario = salario;
            }

            System.out.println("Digite o número de filhos do habitante " + numHabitantes + ":");
            int numFilhos = scan.nextInt();
            filhosTotal += numFilhos;

            if (salario < 1000) {
                habitantesComSalarioMenorQue1000++;
            }

            System.out.println("Deseja inserir informações sobre mais um habitante? (S/N)");
            resposta = scan.next();
        } while (resposta.equalsIgnoreCase("S"));

        double mediaSalario = salarioTotal / numHabitantes;
        double mediaFilhos = (double) filhosTotal / numHabitantes;
        double percentualSalarioMenorQue1000 = (double) habitantesComSalarioMenorQue1000 / numHabitantes * 100;

        System.out.println("Média de salário da população: " + mediaSalario);
        System.out.println("Média do número de filhos: " + mediaFilhos);
        System.out.println("Maior salário dos habitantes: " + maiorSalario);
        System.out.println("Percentual de pessoas com salário menor que R$ 1000,00: " + percentualSalarioMenorQue1000 + "%");
    }
}
