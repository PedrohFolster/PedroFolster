package exercicios;

import java.util.Scanner;

public class Feira {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double quiloMaca;
        double precoMaca;
        double quiloLaranja;
        double precoLaranja;

        System.out.println("numerosInformados de quilos de Maça: ");
        quiloMaca = scan.nextDouble();

        System.out.println("Valor do preço do quilo da maça: ");
        precoMaca = scan.nextDouble();

        System.out.println("numerosInformados de quilos de Laranja: ");
        quiloLaranja = scan.nextDouble();

        System.out.println("Valor do preço do quilo da laranja: ");
        precoLaranja = scan.nextDouble();

        System.out.println("Quilos de maça: " + quiloMaca);
        System.out.println("Preço da maça: " + precoMaca);
        System.out.println("Quilos de laranja: " + quiloLaranja);
        System.out.println("Preço da laranja: " + precoLaranja);

        double totalLaranja = (quiloLaranja * precoLaranja);
        double totalMaca = (quiloMaca * precoMaca);

        System.out.println("Valor total gasto na feira: R$ " + (totalLaranja + totalMaca));

    }
}