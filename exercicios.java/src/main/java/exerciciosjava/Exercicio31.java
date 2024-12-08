package exerciciosjava;
import java.util.Scanner;

public class Exercicio31 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salMinimo = 1412;

        System.out.print("Digite seu salario: ");
        double sal = sc.nextDouble();

        double media = sal / salMinimo;

        System.out.printf("O funcionário recebe %.2f salários-mínimos.", media);

    }
}

// Faça um programa que leia o valor do salário-mínimo e o salário de um funcionário, e exiba
// quantos salários-mínimos ele recebe.
