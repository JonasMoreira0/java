/*Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida: 
- Imprimir todos os elementos do vetor 
- Mostrar na tela a soma e a média dos elementos do vetor  */

package application;

import java.util.Locale;
import java.util.Scanner;

public class soma_vetor {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        //QUANTOS NUMEROS A SER DIGITADOS
        System.out.print("Quantos numeros você vai digitar? ");
        int n = sc.nextInt();
        double[] vetor = new double[n];
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextInt();
        } 
        
        double soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }

        double media = soma / n;
        System.out.print("\nVALORES =");
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("%.1f ", vetor[i]);
        }

        //SOMA E A MEDIA
        System.out.printf("\nSOMA = %.2f\n", soma);
        System.out.printf("MEDIA = %.2f\n", media);    
        sc.close();
    }
}
