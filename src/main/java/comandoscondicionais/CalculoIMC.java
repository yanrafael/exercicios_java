package comandoscondicionais;
import java.util.Scanner;

public class CalculoIMC {

    public static void main(String[] args) {

        float altura, peso, imc;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a sua altura (em metros): ");
        altura = entrada.nextFloat();

        System.out.println("Digite o seu peso (em quilos): ");
        peso = entrada.nextFloat();

        entrada.close();

        //calculo imc formula: peso / altura (altura * altura)

        imc = peso / (altura * altura);

        System.out.println("seu imc é: " + imc);
        if (imc >= 18.5){
            System.out.println("abaixo do peso.");
        }else if (imc < 25){
            System.out.println("Peso ideal");
        }else if (imc < 30){
            System.out.println("um pouco acima do peso");
        }else if (imc < 35){
            System.out.println("obesidade grau I");
        }else if (imc < 40){
            System.out.println("obesidade grau II");
        }else{
            System.out.println("obesidade grau III ou morbida");
        }
    }

}
