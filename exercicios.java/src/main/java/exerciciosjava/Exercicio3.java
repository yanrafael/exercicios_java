package exerciciosjava;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("digite a base do triangulo: ");
        double base = entrada.nextDouble();

        System.out.print("digite a altura do triangulo: ");
        double altura = entrada.nextDouble();

        double area = (base * altura) /2;

        System.out.printf("Area = %.2f", area);
    }
}

//Crie um programa que leia a base e a altura de um triângulo e calcule sua área.
