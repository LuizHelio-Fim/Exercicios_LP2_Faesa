package exercicios;

import java.util.Scanner;

public class Ex012 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double altura, sumAlturaMulheres = 0;
		int numHomensMaiores = 0, numMaximoMulheres = 0;
		String sexo;
		
		System.out.println("Digite o numero de pessoas total: ");
		int numPessoas = sc.nextInt();
		
		
		for (int i=0; i<numPessoas; i++) {
			System.out.println("Digite a altura "+ (i+1) +": ");
			altura = sc.nextDouble();
			System.out.println("Digite seu sexo: (M ou F)");
			sexo = sc.next().toUpperCase();
			
			if (altura > 1.7 && sexo.equals("M")) {
				numHomensMaiores += 1;
			}
			if (sexo.equals("F")) {
				numMaximoMulheres += 1;
				sumAlturaMulheres += altura;
			}
		}
		
		double mediaAlturaF = sumAlturaMulheres/numMaximoMulheres;
		
		System.out.println("INFOS:");
		System.out.printf("Numero de homens e mulheres medidos: %d%n", numPessoas);
		System.out.printf("Homens acima de 1.7m: %d%n", numHomensMaiores);
		System.out.printf("Média das alturas das mulheres: %.2f", mediaAlturaF);
		
		sc.close();
	}

}
