package exerciciosjava;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercicio86 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        List<Integer> lista = new ArrayList<Integer>();

        for (int c = 1; c <= 10; c++) {
            System.out.print("Digite o " + c + " número: ");
            int num = entrada.nextInt();
            lista.add(num);
        }
        System.out.println("Lista: " + lista);
        Collections.sort(lista);
        System.out.println("Em ordem crescente: " + lista);
    }
}

// Crie um programa que leia 10 números inteiros e exiba-os em ordem crescente.
