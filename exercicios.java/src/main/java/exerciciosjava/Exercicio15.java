package exerciciosjava;
import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu salario: ");
        double sal = sc.nextDouble();

        double total = sal + (sal * 0.15);

        System.out.printf("Seu novo sálario com um aumento de 15/100 é: R$%.2f " , total);
    }
}

//Crie um programa que leia o salário de um funcionário e calcule o novo salário com um aumento de 15%.
