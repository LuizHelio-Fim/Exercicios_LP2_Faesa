package exercicios;

import java.util.Scanner;

public class Atv15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int tempoDeJogoHoras = 0;
        int tempoDeJogoMinutos = 0;
        
        System.out.println("Informe a hora que iniciou o jogo: ");
        int horaInicial = sc.nextInt();
        
        System.out.println("Informe os minutos iniciais do jogo: ");
        int minutoInicial = sc.nextInt();
        
        System.out.println("Informe a hora final do jogo: ");
        int horaFinal = sc.nextInt();
        
        System.out.println("Informe os minutos finais do jogo: ");
        int minutoFinal = sc.nextInt();
        
        int minutosTotaisIniciais = horaInicial * 60 + minutoInicial;
        int minutosTotaisFinais = horaFinal * 60 + minutoFinal;
        
        if (minutosTotaisIniciais > minutosTotaisFinais) {
            minutosTotaisFinais += 24 * 60; //corrigir o erro do dia seguinte
        }
        
        int tempoDeJogo = minutosTotaisFinais - minutosTotaisIniciais;
        
        tempoDeJogoHoras = tempoDeJogo / 60;
        tempoDeJogoMinutos = tempoDeJogo % 60;
        

        System.out.println("Duração do jogo: " + tempoDeJogoHoras + " hora(s) e " + tempoDeJogoMinutos + " minuto(s)");
        
        sc.close();
    }
}
