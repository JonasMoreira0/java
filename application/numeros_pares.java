package application;

import java.util.Locale;
import java.util.Scanner;

public class numeros_pares {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantos numeros você vai digitar? ");
        int n = sc.nextInt();

        int[] vetor = new int[n];
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextInt();
        }

        System.out.println("NUMEROS PARES:");
        
        int qntPares = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                    System.out.printf(" "+ vetor[i]);
                    
                qntPares++;
            }
        }

        System.out.printf("\n\nQUANTIDADE DE PARES = %d\n",qntPares);
        sc.close();
    }
}
