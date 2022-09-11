package EstruturaRepetitiva;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Integer idade, somaIdades = 0, quantidadeIdades = 0;

        System.out.println("Idades: ");
        idade = sc.nextInt();

        while(idade > 0){
            somaIdades += idade;
            quantidadeIdades = quantidadeIdades + 1;

            idade = sc.nextInt();
        }

        if(quantidadeIdades == 0){
            System.out.println("IMPOSSÍVEL CALCULAR");
        }else{
            Double media =  (somaIdades.doubleValue() / quantidadeIdades.doubleValue());
            System.out.printf("soma idades: %d", somaIdades);
            System.out.printf("quantidade idades: %d", quantidadeIdades);
            System.out.printf("MEDIA = %.2f" , media);
        }
        
        sc.close();
    }
}
