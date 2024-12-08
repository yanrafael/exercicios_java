package exerciciosjava;
import java.util.Scanner;

public class Exercicio71 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = sc.nextInt();

        System.out.print("Os divisores desse número são: ");
        for (int i = 1; i <= n; i++){
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}

// Crie um programa que leia um número inteiro positivo e exiba todos os divisores desse número.
