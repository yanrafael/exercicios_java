package exerciciosjava;
import java.util.Scanner;

public class Exercicio70 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número para a tabuada: ");
        int n = sc.nextInt();

        for (int c = 1; c <= 10; c++) {
            System.out.println(n + " X " + c + " = " + (n * c));
        }
    }
}


// Escreva um programa que leia um número inteiro e exiba a tabuada desse número até o décimo valor.