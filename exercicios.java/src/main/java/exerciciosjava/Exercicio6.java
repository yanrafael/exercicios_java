package exerciciosjava;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("digite um numero inteiro: ");
        int n = sc.nextInt();

        if(n % 2 == 0){
            System.out.println("é par");
        }else{
            System.out.println("é impar");
        }


    }
}

// Crie um programa que leia um número inteiro e exiba se ele é par ou ímpar.