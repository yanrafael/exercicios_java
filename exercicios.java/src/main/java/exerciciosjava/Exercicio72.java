package exerciciosjava;
import java.util.Scanner;

public class Exercicio72 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int n = sc.nextInt();

        boolean ehPrimo = true;
        int divisor = 2;

        int mul = divisor * divisor;

        for (mul = 1; mul <= divisor; mul++) {
            if (n % divisor == 0) {
                ehPrimo = false;
                break;
            }
        }
        if (ehPrimo) {
            System.out.println(n + " é um número primo.");
        } else {
            System.out.println(n + " não é um número primo.");
        }
        sc.close();

    }
}

// Faça um programa que leia um número inteiro e exiba se ele é um número primo.
