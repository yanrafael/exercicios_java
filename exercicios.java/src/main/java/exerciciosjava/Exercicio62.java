package exerciciosjava;
import java.util.Scanner;

public class Exercicio62 {

    public static void main(String[] args) {

        int cont = 1;

        System.out.print("Números ímpares: ");
        do {
            if (cont % 2 != 0) {
                System.out.print(cont + " ");
            }
            cont++;
        } while (cont <= 50);
    }
}

// Crie um programa que exiba os números ímpares de 1 a 50 usando o loop "do-while".
