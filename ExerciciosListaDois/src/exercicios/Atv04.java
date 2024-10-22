package exercicios;

import java.util.Scanner;

public class Atv04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double newSalary;
		
		System.out.println("Informe o seu salario: ");
		double salary = sc.nextDouble();
		
		System.out.print("Informe o Codigo do seu cargo: "
						+ "\n101 - Gerente"
						+ "\n102 - Engenheiro"
						+ "\n103 - Técnico"
						+ "\n104 - Outro"
						+ "\n>");
		int escolha = sc.nextInt();
		
		switch (escolha) {
			case 101:
				newSalary = salary + (salary*0.1);
				break;
			case 102:
				newSalary = salary + (salary*0.2);
				break;
			case 103:
				newSalary = salary + (salary*0.3);
				break;
			default:
				newSalary = salary + (salary*0.05);
		}
		
		System.out.printf("Salario antigo: R$%.2f%n"
						+ "Salario novo: R$%.2f%n"
						+ "ganho: R$%.2f%n", salary, newSalary, (newSalary - salary));
		
		sc.close();
	}

}
