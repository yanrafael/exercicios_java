package exerciciosjava;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio93 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> list = new ArrayList<Integer>();
        int cont = 0;

        for (int c = 1; c <= 10; c++) {
            System.out.print("Digite o " + c + " número: ");
            int num = sc.nextInt();
            list.add(num);
        }
        for (int numero : list) {
            if (numero > 10 && numero < 50) {
                cont++;
            }

        }
        System.out.println("Quantidade de números entre 10 e 50: " + cont);
    }
}

// Faça um programa que leia 10 números inteiros e exiba quantos deles estão no intervalo de 10
// a 50.
