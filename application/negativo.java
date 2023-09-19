package application;

import java.util.Locale;
import java.util.Scanner;

public class negativo {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantos numeros você vai digitar? ");
        int n = sc.nextInt();
        int[] vetor = new int[n];
        
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = sc.nextInt();
        
        }
        System.out.println("Números negativos lidos:");

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < 0) {
                System.out.println(vetor[i]);
            }
        }

        sc.close();
    }
}
