package Exercicios;

import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Forneça o numero de linhas da matriz: ");
		int linhas = sc.nextInt();
		System.out.println("Agora o numero de colunas: ");
		int colunas = sc.nextInt();
		
		int m[][] = new int[linhas][colunas];
		
		for (int i=0; i < linhas; i++) {
			System.out.print("Linha " + (i+1) + " ");
			for(int j=0; j < colunas; j++) {
				System.out.println("Coluna " + (j+1) + ":");
				m[i][j] = sc.nextInt();
			}
		}
		
		for (int i=0; i < linhas; i++) {
			for(int j=0; j < colunas; j++) {
				System.out.printf("%4d", m[i][j]);
			}
			System.out.println(" ");
		}
		
		double media = mediaMatriz(m);
		System.out.println("A média é: " + media);
		
		sc.close();
	}
	
	public static double mediaMatriz(int matriz[][]) {
		int soma = 0;
		int cont = 0;
		
		for (int linha[] : matriz) {
			for (int elemento : linha) {
				soma += elemento;
				cont++;
			}
		}
		return (double)soma/cont;
	}

}