package exerciciosjava;
import java.util.Scanner;

public class Exercicio73 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int limite = sc.nextInt();

        int a = 0, b = 1;
        System.out.print("Sequência de Fibonacci: ");

        for (; a<= limite;){
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
    }
}

// Escreva um programa que leia um número inteiro e exiba a sequência de Fibonacci até o número
// lido.
