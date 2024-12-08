package exerciciosjava;
import java.util.Scanner;

public class Exercicio74 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double soma = 0;

        for (int c = 1; c <= 5; c++) {
            System.out.print("Digite o nome da " + c + " pessoa: ");
            String nome = sc.nextLine();

            System.out.print("Digite a idade da " + c + " pessoa: ");
            int idade = sc.nextInt();
            sc.nextLine();

            soma += idade;
        }
        System.out.printf("A media das idades é: %.2f", soma / 5);
    }
}

// Crie um programa que leia o nome e a idade de 5 pessoas e exiba a média das idades.
