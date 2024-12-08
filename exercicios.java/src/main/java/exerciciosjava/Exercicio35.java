package exerciciosjava;
import java.util.Scanner;

public class Exercicio35 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("digite um numero inteiro: ");
        int nota = sc.nextInt();

        if (nota >= 7) {
            System.out.println("aprovado");
        }else {
            System.out.println("reprovado");
        }

    }
}

// Escreva um programa que leia três números inteiros e exiba a média aritmética.
// Se a média for maior ou igual a 7, exiba a mensagem "Aprovado",
// caso contrário, exiba a mensagem "Reprovado".
