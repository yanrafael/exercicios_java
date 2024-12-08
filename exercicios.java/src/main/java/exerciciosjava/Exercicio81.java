package exerciciosjava;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio81 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o " + i + " número: ");
            int num = sc.nextInt();
            list.add(num);
        }
        System.out.println("Números digitados: " + list);

        System.out.println("Números na ordem inversa:");
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }

    }
}

// Faça um programa que leia 5 números inteiros e exiba-os na ordem inversa em que foram digitados.
