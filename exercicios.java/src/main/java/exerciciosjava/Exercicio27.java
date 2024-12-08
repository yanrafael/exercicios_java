package exerciciosjava;
import java.util.Scanner;

public class Exercicio27 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        System.out.print("Digite seu sexo: ");
        char sexo = sc.next().toUpperCase().charAt(0);

        if (sexo == 'M') {
            if (idade >= 65) {
                System.out.print("pode aposentar");
            }else{
                System.out.print("não pode aposentar.");
            }
        } else if (sexo == 'F') {
            if (idade >= 60) {
                System.out.println("pode aponsentar");
            }else {
                System.out.print("não pode aposentar.");
            }

        }


    }
}

// Crie um programa que leia a idade de uma pessoa e seu sexo (M ou F) e exiba uma mensagem
// indicando se ela pode ou não se aposentar. Homens podem se aposentar com 65 anos ou mais, e
// mulheres com 60 anos ou mais.
