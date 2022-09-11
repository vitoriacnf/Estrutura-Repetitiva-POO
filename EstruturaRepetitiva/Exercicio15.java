package EstruturaRepetitiva;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero, fatorial = 1;

        System.out.print("Digite o valor de N: ");
        numero = sc.nextInt();

        numero++;
        for(int i = numero; i > 1; i-- ){
            fatorial = fatorial * (i - 1);            
        }
        System.out.printf("FATORIAL %d",fatorial);
        sc.close();


    }
}
