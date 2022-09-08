package EstruturaRepetitiva;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = 0, Y = 0;

        System.out.println("Digite dois números:");
        X = sc.nextInt();
        Y = sc.nextInt();

        while (X != Y) {
            if (X > Y) {
                System.out.println("DECRESCENTE!");
            } else {
                System.out.println("CRESCENTE!");
            }
            
            System.out.println("Digite outros dois números:");
            X = sc.nextInt();
            Y = sc.nextInt();

        }

        sc.close();

    }
}
