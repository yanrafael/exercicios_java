package exerciciosjava;
import java.util.Scanner;

public class Exercicio46 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = sc.nextInt(), cont = 1, soma = 0;

        while (cont <= n) {
            if (cont % 2 == 0) {
                soma += cont;
            }
            cont++;

        }
        System.out.println(soma);
    }
}


// Escreva um programa que leia um número inteiro e exiba a soma de todos os números pares entre
// 1 e o número lido usando o loop "while".
