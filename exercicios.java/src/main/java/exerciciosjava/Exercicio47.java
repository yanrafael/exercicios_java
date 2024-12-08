package exerciciosjava;
import java.util.Scanner;

public class Exercicio47 {

    public static void main(String[] args) {

        int cont = 1;

        System.out.print("Números ímpares: ");
        while (cont <= 50) {
            if (cont % 2 != 0) {
                System.out.print(cont + " ");
            }
            cont++;
        }
    }
}

// Crie um programa que exiba os números ímpares de 1 a 50 usando o loop "while".
