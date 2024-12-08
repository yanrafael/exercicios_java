package exerciciosjava;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio82 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        List<Integer> lista = new ArrayList<Integer>();
        int soma = 0;

        for (int c = 1; c <= 10; c++) {
            System.out.print("Digite o " + c + " número: ");
            int numero = entrada.nextInt();
            lista.add(numero);
        }
        for (int element : lista) {
            soma += element;
        }
        System.out.println("Soma: " + soma);
    }
}

// Escreva um programa que leia 10 números inteiros e exiba a soma deles.
