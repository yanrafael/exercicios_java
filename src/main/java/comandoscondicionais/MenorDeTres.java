package comandoscondicionais;

import java.util.Scanner;

public class MenorDeTres {
    public static void main(String[] args) {

        int n1, n2, n3;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite tres numeros inteiros: ");
        n1 = entrada.nextInt();
        n2 = entrada.nextInt();
        n3 = entrada.nextInt();

        entrada.close();

        if(n1 < n2 && n1 < n3){
            System.out.println(n1 + " é o menor numero.");
        }else if(n2 < n1 && n2 < n3){
            System.out.println(n2 + " é o menor numero.");
        }else{
            System.out.println(n3 + " é o menor numero.");
        }
    }
}
