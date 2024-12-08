package exerciciosjava;
import java.util.Scanner;

public class Exercicio108 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] matriz = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Digite o número para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < 4; i++) {
            int maior = matriz[i][0];
            for (int j = 1; j < 4; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
            }
            System.out.println("O maior valor na linha " + i + " é: " + maior);
        }

        in.close();
    }
}

// Faça um programa que leia uma matriz 4x4 de números inteiros e exiba o maior valor presente em cada linha.
