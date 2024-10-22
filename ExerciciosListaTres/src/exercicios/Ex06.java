package exercicios;
import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {

        int FATORIAL = 1;
        int CONTADOR = 1;

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número para calcular o fatorial: ");
        int numero = sc.nextInt();

        while (CONTADOR <= numero) {
            FATORIAL *= CONTADOR;
            CONTADOR++;      
        }

        System.out.println("O fatorial de " + numero + " é: " + FATORIAL);
        
        sc.close();
    }
}
