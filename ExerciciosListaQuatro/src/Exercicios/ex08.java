package Exercicios;

import java.util.Scanner;

public class ex08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Forneça o tamanho da lista de numeros que irá inserir: ");
		int tamanho = sc.nextInt();
		
		int numeros[] = new int[tamanho];
		
		System.out.println("Agora forneça os numeros: ");
		for (int i=0; i < tamanho; i++) {
			numeros[i] = sc.nextInt();
		}
		
		System.out.println("Forneça o numero de separação: ");
		int maior = sc.nextInt();
		
		System.out.print("Números maiores que " + maior + " fornecidos: ");
        int[] maiores = maiores(numeros, maior);
		printVetor(maiores);
		
		sc.close();
	}
	
	public static int[] maiores(int numeros[], int maior) {
		int cont = 0;
		
		for (int i=0; i < numeros.length; i++) {
			if (numeros[i] > maior) {
				cont++;
			}
		}
		
		int maiores[] = new int[cont];
		int index = 0;
		
		for (int i=0; i < numeros.length; i++) {
			if (numeros[i] > maior) {
				maiores[index] = numeros[i];
				index++;
			}
		}
		return maiores;
	}
	
	public static void printVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i]);
            if (i < vetor.length - 1) {
                System.out.print(", ");
            }
        }
    }

}
