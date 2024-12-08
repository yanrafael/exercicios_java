package exerciciosjava;
import java.util.Scanner;

public class Exercicio53 {

    public static void main(String[] args) {

        int cont = 1;

        do {
            if (cont % 2 == 0) {
                System.out.println(cont);
            }
            cont++;
        }while (cont <= 50);
    }
}

// Crie um programa que exiba os números pares de 1 a 50 usando o loop "do-while".
