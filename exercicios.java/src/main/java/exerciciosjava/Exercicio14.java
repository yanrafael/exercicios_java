package exerciciosjava;
import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ano que voce nasceu: ");
        int ano = sc.nextInt();
        System.out.println("mes que voce nasceu: ");
        int mes = sc.nextInt();
        System.out.println("dia que voce nasceu: ");
        int dia = sc.nextInt();

        int total = (ano * 365) + (mes * 30) + dia;
        System.out.println("A total de dias de vida: " + total);
    }
}

//Escreva um programa que leia a idade de uma pessoa em anos, meses e dias, e calcule quantos dias
// de vida ela tem.
