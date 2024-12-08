package exerciciosjava;
import java.util.Scanner;

public class Exercicio97 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[2][2];
        int soma = 0;

        System.out.println("Digite os números:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
                soma += matriz[i][j];
            }
        }
        System.out.println("\nMatriz 2x2:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("\n Soma dos elementos: " + soma);
    }
}

// Escreva um programa que leia uma matriz 2x2 de números inteiros e calcule a soma de todos os elementos.