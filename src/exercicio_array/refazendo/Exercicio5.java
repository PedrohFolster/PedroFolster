package exercicio_array.refazendo;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double [] notas = new double[10];
        double totalNotas = 0;
        int notasAbaixo = 0, notasAcima = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Informe as notas do " + (i + 1) + "° aluno: ");
            notas[i] = scan.nextInt();

            totalNotas += notas[i];
        }
        System.out.println();
        double mediaNotas = totalNotas / notas.length;

        System.out.println("A média das notas da turma foi de: " + mediaNotas);

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] < mediaNotas) {
                notasAbaixo++;
            } else {
                notasAcima++;
            }
        }
        System.out.println("Dentre as notas da turma, " + notasAbaixo + " aluno(s) ficaram abaixo da média!");
        System.out.println("Dentre as notas da turma, " + notasAcima + " aluno(s) ficaram acima da média!");
    }
}
