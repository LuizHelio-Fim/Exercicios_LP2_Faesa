package exercicios;

import java.util.Scanner;

public class Atv03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Forneça dois numeros inteiros: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.print("ESCOLHA: "
						+ "\n1. +"
						+ "\n2. -"
						+ "\n3. *"
						+ "\n4. /"
						+ "\n>");
		int escolha = sc.nextInt();
		
		switch(escolha) {
			case 1:
				int soma = num1 + num2;
				System.out.println(num1 +" + "+ num2 +" = "+ soma);
				break;
			case 2:
				int sub = num1 - num2;
				System.out.println(num1 +" - "+ num2 +" = "+ sub);
				break;
			case 3:
				int multi = num1 * num2;
				System.out.println(num1 +" * "+ num2 +" = "+ multi);
				break;
			case 4:
				int div = num1 / num2;
				System.out.println(num1 +" / "+ num2 +" = "+ div);
				break;
			default:
				System.out.println("Opção inválida");
		}
		
		sc.close();
	}

}
