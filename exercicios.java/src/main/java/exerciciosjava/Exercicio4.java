package exerciciosjava;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("digite a primeira nota:");
        double nota1 = entrada.nextDouble();

        System.out.println("digite a segunda nota:");
        double nota2 = entrada.nextDouble();

        System.out.println("digite a terceira nota:");
        double nota3 = entrada.nextDouble();

        double media = (nota1 * 2 + nota2 * 3 + nota3 * 5) / (2 + 3 + 5);

        System.out.printf("media: %.2f", media);
    }
}

//Faça um programa que receba três notas de um aluno (cada nota de 0 a 10) e calcule a média ponderada
//considerando pesos 2, 3 e 5 para as notas, respectivamente.