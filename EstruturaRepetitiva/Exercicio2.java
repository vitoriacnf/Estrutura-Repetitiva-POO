package EstruturaRepetitiva;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int idade = 0;
        double media;

        // System.out.println("Digite as idades: ");
        // idade = sc.nextInt();
        System.out.println("Digite as idades: ");
        idade = sc.nextInt();

        while (idade > 0) {
            if (idade > 0) {
                // media = idade / idade;
                // System.out.println("MÉDIA: " + media);
            } else {
                System.out.println("IMPOSSIVEL CALCULAR");
            }
        }

        sc.close();
    }
}
