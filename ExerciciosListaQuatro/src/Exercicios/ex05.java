package Exercicios;

import java.util.Scanner;

public class ex05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números serão digitados?");
        int tot = sc.nextInt();

        int numeros[] = new int[tot];

        for (int i = 0; i < tot; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        int[] pares = valoresPares(numeros);
        
        if (pares.length > 0) {
            System.out.print("Números pares: ");
            for (int par : pares) {
                System.out.print(par + " ");
            }
        } else {
            System.out.println("Não há números pares.");
        }

        sc.close();
    }

    public static int[] valoresPares(int numeros[]) {
        int contPares = 0;
        for (int num : numeros) {
            if (num % 2 == 0) {
                contPares++;
            }
        }

        int[] pares = new int[contPares];
        int indice = 0;

        for (int num : numeros) {
            if (num % 2 == 0) {
                pares[indice++] = num;
            }
        }
        return pares;
    }

}
