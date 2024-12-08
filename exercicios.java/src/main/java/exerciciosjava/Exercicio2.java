package exerciciosjava;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("digite o raio do circulo: ");
        double raio = entrada.nextDouble();

        double area = Math.PI * Math.pow(raio, 2);
        double perimetro = 2 * Math.PI * raio;

        System.out.printf("area do circulo: %.2f%n", area);
        System.out.printf("perimetro do circulo: %.2f%n", perimetro);
    }
}


//Escreva um programa que leia o raio de um círculo e calcule sua área e perímetro.