package exerciciosjava;
import java.util.Scanner;

public class Exercicio55 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número para a tabuada: ");
        int n = sc.nextInt();
        int cont = 1;

        do {
            System.out.println(n + " X " + cont + " = " + (n * cont));
            cont++;
        }while (cont <= 10);

    }
}

// Escreva um programa que leia um número inteiro e exiba a tabuada desse número até o décimo
// valor usando o loop "do-while".
