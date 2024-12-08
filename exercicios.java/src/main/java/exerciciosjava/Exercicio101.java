package exerciciosjava;
import java.util.Scanner;

public class Exercicio101 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        int soma = 0;
        int totalElementos = 16;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Digite o número para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = in.nextInt();
                soma += matriz[i][j];
            }
        }

        double media = (double) soma / totalElementos;
        System.out.println("A média aritmética dos elementos da matriz é: " + media);

        in.close();
    }
}

// Crie um programa que leia uma matriz 4x4 de números inteiros e exiba a média aritmética dos elementos.
