package exerciciosjava;
import java.util.Scanner;

public class Exercicio103 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int menorValor = Integer.MAX_VALUE;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite o número para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = in.nextInt();
                if (matriz[i][j] < menorValor) {
                    menorValor = matriz[i][j];
                }
            }
        }

        System.out.println("O menor valor presente na matriz é: " + menorValor);

        in.close();
    }
}

// Escreva um programa que leia uma matriz 3x3 de números inteiros e exiba o menor valor presente na matriz.
