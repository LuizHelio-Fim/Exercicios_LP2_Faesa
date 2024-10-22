package exercicios;

public class Ex09 {
    public static void main(String[] args) {
        int termos = 50;
        double soma = 0.0;

        for (int i = 1; i <= termos; i++) {
            soma += 1.0 / i; 
            System.out.print("1/" + i);

            if (i < termos) {
                System.out.print(" + "); 
            }
        }

        System.out.println(" = " + soma);
    }
}
