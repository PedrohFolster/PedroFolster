package exemplos;

public class Calculos {

    public static void main(String[] args) {

        int numero1 = 3;
        int numero2 = 6;
        double resultDivisao = 1.0 * numero1 / numero2;

        System.out.println("Soma: " + (numero1 + numero2));
        System.out.println("Subtração: " + (numero1 - numero2));
        System.out.println("Multiplicação: " + (numero1 * numero2));
        System.out.println("Divisão: " + resultDivisao);

        System.out.println(++numero1);
        System.out.println(numero1++);
        System.out.println(numero1);

        System.out.println("Resto da divisão: " + numero1 % 2);
    }
}
