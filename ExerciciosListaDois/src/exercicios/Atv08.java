package exercicios;

import java.util.Scanner;

public class Atv08 {

	public double distance;
	public int time;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Atv08 car1, car2;
		car1 = new Atv08();
		car2 = new Atv08();
		
		System.out.println("Forneça a distancia percorrida pelo carro 1(Km) e o seu tempo(h): ");
		car1.distance = sc.nextDouble();
		car1.time = sc.nextInt();
		
		System.out.println("Agora forneça a distancia percorrida pelo carro 2(Km) e o seu tempo(h): ");
		car2.distance = sc.nextDouble();
		car2.time = sc.nextInt();
		
		double vmCar1 = car1.distance/(double)car1.time;
		double vmCar2 = car2.distance/(double)car2.time;
		
		if (vmCar1 > vmCar2) {
			System.out.println("O carro 1 teve a maior velocidade média: " + vmCar1);
		} else {
			System.out.println("O carro 2 teve a maior velocidade média: " + vmCar2);
		}
		
		sc.close();
	}

}
