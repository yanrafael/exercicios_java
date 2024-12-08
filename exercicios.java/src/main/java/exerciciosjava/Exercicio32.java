package exerciciosjava;
import java.util.Scanner;

public class Exercicio32 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("digite o nome do aluno ");
        String nome = sc.nextLine();

        System.out.print("Digite a nota da prova do aluno ");
        int nota = sc.nextInt();

        if (nota >= 7) {
            System.out.println("O aluno " + nome + " foi aprovado na prova.");
        }else {
            System.out.println("O aluno " + nome + " foi reprovado na prova.");
        }

    }
}

// Escreva um programa que leia a nota de um aluno em uma prova
// e exiba a sua conceituação conforme a tabela de notas.