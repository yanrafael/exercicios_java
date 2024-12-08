package comandoscondicionais;

import java.util.Scanner;

public class Switch4 {

    public static void main(String[] args) {

        int salarios;

        String cargos;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Por favor, digite o código para saber o cargo e salário: ");
        salarios = entrada.nextInt();

        switch (salarios){

            case 1: cargos = "programador estagiário: \n Salário: 1.540 reais.";
            break;
            case 2: cargos = "programador junior: \n Salário: 3.360 reais.";
                break;
            case 3: cargos = "programador pleno: \n Salário: 5.650 reais.";
                break;
            case 4: cargos = "programador sênior: \n Salário: 9.200 reais.";
                break;
            case 5: cargos = "programador master: \n Salário: 14.160 reais.";
                break;
                default: cargos = "código inexistente.";
        }

        System.out.println(cargos);

    }
}
