package exerciciosjava;
import java.util.Scanner;

public class Exercicio20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("É par");
        }else {
            System.out.println("é impar");
        }
    }
}

// Escreva um programa que leia um número inteiro e exiba se ele é par ou ímpar.
