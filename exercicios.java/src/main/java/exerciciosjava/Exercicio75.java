package exerciciosjava;
import java.util.Scanner;

public class Exercicio75 {

    public static void main(String[] args) {

        int a = 0, b = 1;
        System.out.print("Sequência de Fibonacci: ");
        for (;a <= 20;){
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }

    }
}

// Faça um programa que exiba os primeiros 20 números da sequência de Fibonacci.
