package exerciciosjava;
import java.util.Scanner;

public class Exercicio40 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número para visualizar a tabuada: ");
        int n = sc.nextInt();
        int cont = 1;

        while (cont <= 10) {
            System.out.println(n + " X " + cont + " = " + (n * cont));
            cont++;
        }
    }
}


// Escreva um programa que leia um número inteiro e exiba a tabuada desse número até o décimo
// valor usando o loop "while".
