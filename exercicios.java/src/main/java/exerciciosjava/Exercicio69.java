package exerciciosjava;
import java.util.Scanner;

public class Exercicio69 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int soma = 0;

        for (int c = 1; c <= 5; c++) {
            System.out.print("Digite o " + c + " número");
            int num = sc.nextInt();
            soma += num;
        }
        System.out.println("A media aritmetica é: " + soma / 5);
        sc.close();
    }
}

// Faça um programa que leia 5 números inteiros e exiba a média aritmética dos valores lidos.
