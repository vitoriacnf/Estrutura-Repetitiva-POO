package EstruturaRepetitiva;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int senha = 0;

        System.out.print("Digite a senha: ");
        senha = sc.nextInt();

        while (senha != 2002) {
            System.out.println("Senha Inválida! Tente Novamente:");

            System.out.print("Digite a senha: ");
            senha = sc.nextInt();
        }

        System.out.println("Acesso permitido!");

        sc.close();
    }
}