package exerciciosjava;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("digite o primeiro numero: ");
        int n1 = entrada.nextInt();

        System.out.print("digite o segundo numero: ");
        int n2 = entrada.nextInt();

        System.out.println("a soma desses numeros são: " + (n1 + n2));
        System.out.println("a subtração é: " + (n1 - n2));
        System.out.println("a divisão é: " + (n2 / n1));
        System.out.println("a multiplicação é: " + (n1 * n2));
    }
}

//Faça um programa que solicite dois números inteiros e exiba a soma, subtração, multiplicação e divisão entre eles
