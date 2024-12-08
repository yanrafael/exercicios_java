package exerciciosjava;
import java.util.Scanner;

public class Exercicio64 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = sc.nextInt();

        int fatorial = 1;
        do {
            fatorial *= n;
            n--;
        } while (n > 0);
        System.out.println(fatorial);
    }
}

// Escreva um programa que calcule o fatorial de um número inteiro inserido pelo usuário usando
// o loop "do-while".
