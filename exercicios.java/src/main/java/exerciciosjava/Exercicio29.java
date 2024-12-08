package exerciciosjava;

import java.util.Scanner;

public class Exercicio29 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual o nome do aluno? ");
        String nome = sc.nextLine();

        System.out.print("Digite a nota do aluno: ");
        int nota = sc.nextInt();

        if (nota >= 7) {
            System.out.println("O aluno " + nome + " foi aprovado.");
        }else {
            System.out.println("O aluno " + nome + " está em recuperção.");
        }

    }
}

// Escreva um programa que leia o nome e a nota de um aluno e exiba sua situação na disciplina
// Se a nota for maior ou igual a 7, o aluno está aprovado. Caso contrário, está em recuperação.
