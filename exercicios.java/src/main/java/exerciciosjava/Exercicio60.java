package exerciciosjava;
import java.util.Scanner;

public class Exercicio60 {

    public static void main(String[] args) {

        int a = 0, b = 1;
        System.out.print("Sequência de Fibonacci: ");
        do {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        } while (a <= 20);
    }
}

// Faça um programa que exiba os primeiros 20 números da sequência de Fibonacci usando o loop
// "do-while".
