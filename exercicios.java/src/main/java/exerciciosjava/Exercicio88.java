package exerciciosjava;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio88 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> list = new ArrayList<Integer>();
        int par = 0, impar = 0;

        for (int c = 1; c <= 5; c++) {
            System.out.print("Digite o " + c + " número: ");
            int num = sc.nextInt();
            list.add(num);
        }
        for (int numero : list) {
            if (numero % 2 == 0) {
                par++;
            }else{
                impar++;
            }
        }
        System.out.println("Par: " + par + " Impar: " + impar);
    }
}

// Escreva um programa que leia 5 números inteiros e calcule a média dos valores pares e a média
// dos valores ímpares.
