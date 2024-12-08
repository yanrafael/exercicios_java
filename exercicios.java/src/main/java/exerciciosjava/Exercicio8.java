package exerciciosjava;
import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int ble;

        System.out.println("Digite um numero: ");
        int n1 = sc.nextInt();
        System.out.println("Digite outro numero: ");
        int n2 = sc.nextInt();

        ble = n1;
        n1 = n2;
        n2 = ble;

        System.out.println("inversão dos numeros: ");
        System.out.println(n1);
        System.out.println(n2);
    }
}

//Escreva um programa que leia dois números inteiros e troque os seus valores, ou seja, o primeiro deve ficar com o
//valor do segundo e vice-versa.
