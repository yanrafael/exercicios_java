package exerciciosjava;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        int numero = sc.nextInt();
        for (int n = 1; n <= 10; n++) {
            System.out.println(numero + " x " + n + " = " + numero * n);


        }
    }
}


// //10) Faça um programa que leia um número inteiro e exiba a sua tabuada de multiplicação até o décimo valor.