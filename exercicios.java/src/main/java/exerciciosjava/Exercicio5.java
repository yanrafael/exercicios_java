package exerciciosjava;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("digite o valor do produto: ");
        double produto = entrada.nextDouble();

        System.out.println("digite o quantidade do produto: ");
        int quantidade = entrada.nextInt();

        double total = produto * quantidade;
        if(quantidade >= 10){
            double soma = total - (total * 0.10);
            System.out.printf("valor total com desconto: R$ %.2f", soma);
        }else{
            System.out.printf("valor total: R$ %.2f", total);
        }
    }
}

//Escreva um programa que leia o preço de um produto e a quantidade comprada, e calcule o valor total a
// ser pago com desconto de 10% se a quantidade for maior que 10 unidades.