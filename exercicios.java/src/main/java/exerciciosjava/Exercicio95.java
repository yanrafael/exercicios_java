package exerciciosjava;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercicio95 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> nomes = new ArrayList<>();

        for (int i = 0; i <= 5; i++) {
            System.out.print("Digite o nome: ");
            nomes.add(sc.nextLine());
        }
        System.out.println(nomes);
        Collections.sort(nomes);
        System.out.println("Orde alfabética: " + nomes);
    }
}

// Crie um programa que leia 5 nomes e exiba-os em ordem alfabética.
