package comandoscondicionais;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {

        int n;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        n = entrada.nextInt();

        entrada.close();

        if(n % 2 == 0){
            System.out.println(n + " é par");
        }else{
            System.out.println(n + " é impar.");
        }
    }
}
