package exerciciosjava;
import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double altura = sc.nextFloat(), peso = sc.nextFloat(), imc;

        imc = peso / (altura * altura);

        System.out.printf("Indice de massa corporal: %.2f", imc);
    }
}

//12) Crie um programa que leia o peso e a altura de uma pessoa e exiba o seu Índice de Massa Corporal (IMC).
