package EstruturaRepetitiva;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valor;

        System.out.print("Deseja a tabuada para qual valor? ");
        valor = sc.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.printf("%d x %d = %d \n", valor, i, valor * i);
        }
        sc.close();
    }
}
