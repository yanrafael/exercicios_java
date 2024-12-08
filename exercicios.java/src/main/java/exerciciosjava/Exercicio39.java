package exerciciosjava;
import java.util.Scanner;

public class Exercicio39 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cont = 1, soma = 0;

        while (cont <= 5){
            System.out.print("Digite o " + cont +" número");
            int num = sc.nextInt();
            soma += num;
            cont++;
        }
        System.out.println("A media aritmetica é: " + soma / 5);
        sc.close();
    }
}

// Faça um programa que leia 5 números inteiros usando o loop "while" e exiba a média aritmética
// dos valores lidos.
