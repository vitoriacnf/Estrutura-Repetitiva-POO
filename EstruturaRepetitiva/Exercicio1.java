package EstruturaRepetitiva;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = 0, Y = 0;

       
        while (X != Y) {
            if (X > Y) {
                System.out.println("Digite dois números:");
                X = sc.nextInt();
                Y = sc.nextInt();
                System.out.print("DECRESCENTE!");
            } else {
                System.out.print("CRESCENTE!");
            }

        }

        sc.close();

    }
}
