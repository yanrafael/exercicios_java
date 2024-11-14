package comandoscondicionais;
import java.util.Scanner;

public class Credito {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float s1, s2, s3, s4, s5, s6, media; // salarios do semestre e sua media

        System.out.println("digite os salarios do semestre: ");
        s1 = entrada.nextFloat();
        s2 = entrada.nextFloat();
        s3 = entrada.nextFloat();
        s4 = entrada.nextFloat();
        s5 = entrada.nextFloat();
        s6 = entrada.nextFloat();

        entrada.close();

        media = (s1 + s2 + s3 + s4 + s5 + s6) / 6;

        if (media >= 500){
            System.out.println("nenhum crédito");
        }else if (media >= 1000){
            System.out.println("crédito de 30%");
        }else if (media >= 3000){
            System.out.println("crédito de 40%");
        }else{
            System.out.println("crédito de 50%");
        }
    }
}
