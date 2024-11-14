package comandoscondicionais; // pacote é uma pasta que organiza as classes

import java.util.Scanner; // importa a classe scanner, utilizada para ler a entrada do usuario

public class MaiorMenor { // essa classe

    public static void main(String[] args) { // ponto de entrada, por onde começa a ser executado

        int n1, n2; // é um tipo

        // cria um objeto da classe Scanner, que contém as características
        Scanner entrada = new Scanner(System.in);

        // pede pro usuario inserir informações
        System.out.println("Digite dois números inteiros: "); // escreve no console
        n1 = entrada.nextInt(); // entra com o primeiro numero
        n2 = entrada.nextInt(); // entra com o segundo numero

        entrada.close();

        if (n1 > n2){
            System.out.println(n1 + " é maior que " + n2);
        } else if (n1 < n2){
            System.out.println(n2 + " é maior que " + n1);
        }else{
            System.out.println(n1 + " é igual a " + n2);
        }

    }
}
