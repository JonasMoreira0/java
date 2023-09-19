/*Fazer um programa para ler um número inteiro N e a altura de N
pessoas. Armazene as N alturas em um vetor. Em seguida, mostrar a
altura média dessas pessoas */
package application;

import java.util.Locale;
import java.util.Scanner;

public class VetorLerAlturaDeN {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("INFORME O VALOR DE N: ");
        int n = sc.nextInt();
        double[] vetor = new double[n];

        for (int i = 0; i < n; i++) {
            vetor[i] = sc.nextDouble();
        }
        
        double soma = 0.0;
        for (int i = 0; i < n; i++) {
            soma += vetor[i];
        }
        double altura = soma / n;
        
        System.out.printf("ALTURA MÉDIA: %.2f%n", altura);
        
        sc.close();
    }
}
