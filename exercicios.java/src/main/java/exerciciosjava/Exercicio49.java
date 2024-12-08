package exerciciosjava;
import java.util.Scanner;

public class Exercicio49 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = sc.nextInt();

        int fatorial = 1;
        while (n > 0) {
            fatorial *= n;
            n--;
        }
        System.out.println(fatorial);
    }
}

// Escreva um programa que calcule o fatorial de um número inteiro inserido pelo usuário usando
// o loop "while".
