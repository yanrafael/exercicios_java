package exerciciosjava;
import java.util.Scanner;

public class Exercicio34 {

    public static void main(String[] args){

        Scanner entradavoto = new Scanner(System.in);

        System.out.println("Digite sua idade");

        int idade = entradavoto.nextInt();

        if (idade >= 18 && idade < 65){
            System.out.println("Voto obrigatório");
        }else if(idade >= 16 || idade >= 65 ){
            System.out.println("Voto opcional");
        }else{
            System.out.println("Não pode votar");
        }
    }
}

//34) Faça um programa que leia a idade de uma pessoa e exiba se ela pode ou não votar.
// O voto é obrigatório para pessoas entre 18 e 70 anos, e facultativo para pessoas entre
// 16 e 18 anos e com mais de 70 anos.