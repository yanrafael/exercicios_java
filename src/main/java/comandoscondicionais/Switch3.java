package comandoscondicionais;

import java.util.Scanner;

public class Switch3 {

    public static void main(String[] args) {

        int combos;

        String opcao;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o número do combo: ");
        combos = entrada.nextInt();

        switch (combos) {
            case 1: opcao = "Combo Clássico Smash: \n Lanche: Smash Burger com 2 hambúrgueres de carne, queijo cheddar derretido, cebola caramelizada, alface, tomate e molho especial da casa no pão brioche.";
            break;
            case 2: opcao = "Combo Vegetariano Supreme: \n Lanche: Hambúrguer de grão-de-bico, alface, tomate, cebola roxa, pepino em conserva e maionese de ervas no pão integral.";
            break;
            case 3: opcao = "Combo Explosão de Frango: \n Lanche: Sanduíche de peito de frango grelhado, bacon crocante, queijo suíço, alface, tomate e molho de pimenta suave no pão de leite.";
            break;
            case 4: opcao = "Combo Tradicional Cremosíssimo: \n Lanche:  X-salada clássico com hambúrguer de carne, queijo prato, alface, tomate, milho e maionese especial no pão com gergelim.";
            break;
            case 5: opcao = "Combo Bacon Lovers: \n Lanche: Hambúrguer com dupla camada de bacon, queijo cheddar duplo, cebola crispy, molho barbecue e picles no pão australiano.";
            break;
            default: opcao = "essa opção nao existe.";
        }

        System.out.println(opcao);
    }
}
