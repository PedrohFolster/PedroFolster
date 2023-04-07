package exercicios_condicionais.extras;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double peso, altura;

        System.out.print("Informe o seu peso: ");
        peso = scan.nextDouble();

        System.out.print("Informe a sua altura em Metros: ");
        altura = scan.nextDouble();

        double indiceDeMassaCorporal = peso / (altura * altura);

        if (indiceDeMassaCorporal < 18.5) {
            System.out.println("Abaixo do peso!");
        } else if (indiceDeMassaCorporal <= 24.9) {
            System.out.println("Normal!");
        } else if (indiceDeMassaCorporal <= 29.9) {
            System.out.println("Sobrepeso!");
        } else if (indiceDeMassaCorporal <= 34.9) {
            System.out.println("Obesidade - Grau I");
        } else if (indiceDeMassaCorporal <= 39.9) {
            System.out.println("Obesidade - Grau II");
        } else {
            System.out.println("Obesidade - Grau III");
        }
        System.out.println("Você está com a média de: " + indiceDeMassaCorporal);
    }
}
