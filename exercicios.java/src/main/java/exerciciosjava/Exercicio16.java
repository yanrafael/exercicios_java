package exerciciosjava;
import java.util.Scanner;

public class Exercicio16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("Esse número e negativo.");
        } else if (num == 0) {
            System.out.println("Esse número e igual a zero.");
        }else  {
            System.out.println("Esse número e positivo.");
        }

    }
}

// Faça um programa que verifique se um número é positivo, negativo ou zero.


