package exerciciosjava;
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("digite seu salário: ");
        double salario = sc.nextDouble();

        double soma = salario + (salario * 0.5);

        System.out.printf("seu salario: %.2f", soma);


    }
}


//Faça um programa que receba o salário base de um funcionário e calcule o seu salário líquido, considerando que o
//funcionário recebe 5% de comissão sobre o salário base.