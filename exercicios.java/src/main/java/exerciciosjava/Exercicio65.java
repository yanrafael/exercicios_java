package exerciciosjava;
import java.util.Scanner;

public class Exercicio65 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double soma = 0;
        int cont = 0;

        do {
            System.out.print("Digite seu nome aqui: ");
            String nome = sc.nextLine().toLowerCase();

            if (nome.equals("fim")) {
                break;
            }

            System.out.print("Digite sua idade: ");
            int idade = sc.nextInt();
            sc.nextLine();

            soma += idade;
            cont++;

        }while (true);
        System.out.printf("A media das idades são: %.2f", soma / cont);
    }
}

// Crie um programa que leia o nome e a idade de várias pessoas usando o loop "do-while" até que
// o nome "fim" seja informado. Ao final, exiba a média das idades.
