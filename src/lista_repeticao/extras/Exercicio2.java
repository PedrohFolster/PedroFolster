package lista_repeticao.extras;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int idade = 0;
        double altura = 0;
        double menor = Double.POSITIVE_INFINITY;
        double somaAltura = 0;
        double somaIdade = 0;

        for (int i = 1; i <= 5; i++) {

            System.out.print("Informe a idade do " + i + "º jogador: ");
            idade = scan.nextInt();

            System.out.print("Informe a altura do " + i + "º jogador em metros: ");
            altura = scan.nextDouble();

            somaIdade += idade;

            if (altura < menor) {
                menor = altura;
            }
            somaAltura += altura;
        }


        double media = somaIdade / 5;
        System.out.println();
        System.out.println("A média das idades dos jogadores foram de: " + media);
        System.out.println("A altura do menor jogador foi de: " + menor);

    }
}
