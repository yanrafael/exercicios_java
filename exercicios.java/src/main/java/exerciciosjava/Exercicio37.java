package exerciciosjava;
import java.util.Scanner;

public class Exercicio37 {

    public static void main(String[] args) {

        int soma = 0, cont = 1;

        while (cont <= 100) {
            soma += cont;
            cont++;
        }
        System.out.println("A soma dos números é: " + soma);
    }
}

// Escreva um programa que calcule a soma dos números de 1 a 100 usando o loop "while".
