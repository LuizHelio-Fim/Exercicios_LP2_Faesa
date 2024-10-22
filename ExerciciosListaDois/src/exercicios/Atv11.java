package exercicios;

import java.util.Scanner;

public class Atv11 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o mês (1-12): ");
        int mes = sc.nextInt();
        System.out.print("Digite o ano: ");
        int ano = sc.nextInt();
        
        int dias = getDiasNoMes(mes, ano);
        
        if (dias != 0) {
            System.out.println("O mês " + mes + " de " + ano + " tem " + dias + " dias.");
        } else {
            System.out.println("Mês inválido.");
        }
        
        sc.close();
    }
    
    public static int getDiasNoMes(int mes, int ano) {
        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9: 
            case 11:
                return 30;
            case 2:
                if (isAnoBissexto(ano)) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                return 0;
        }
    }
    
    public static boolean isAnoBissexto(int ano) {
        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            return true;
        }
        return false;
    }
}
