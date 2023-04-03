package exercicios_condicionais;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int horasSemanais = 40 * 4;

        System.out.println("Horas trabalhadas em um mês: ");
        int totalHorasTrabalhadas = scan.nextInt();

        System.out.println("Qual o valor que o funcionário ganha por hora trabalhada? ");
        int valorPorHoraTrabalhada = scan.nextInt();

        int salarioFinal = valorPorHoraTrabalhada * totalHorasTrabalhadas;
        int horaExtra = (int) (horasSemanais * 0.05);

        if (totalHorasTrabalhadas > horasSemanais) {
            System.out.println("O funcionário trabalhou por mais horas, portanto fez hora extra.");
            int valorComHoraExtra = (totalHorasTrabalhadas * horaExtra);
            System.out.println("O funcionário trabalhou por: " + totalHorasTrabalhadas + " horas, e recebeu um total de R$ " + valorComHoraExtra + " reais.");

        } else {
            System.out.println("O funcionário não teve acrescimo nas horas, portanto trabalhou 40 horas semanais.");
            System.out.println("O funcionário trabalhou por: " + totalHorasTrabalhadas + " e recebeu um total de R$ " +salarioFinal + " reais.");
        }
    }
}
