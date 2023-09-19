package application;

import java.util.Locale;
import java.util.Scanner;

public class abaixo_da_media {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        
        int n;
        double media, soma;
        
        System.out.print("Quantos elementos vai ter o vetor? ");
        n = scanner.nextInt();

        double[] vetor = new double[n];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = scanner.nextDouble();
        }

        soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }

        media = soma / n;
        System.out.printf("\nMEDIA DO VETOR = %.3f\n", media);
        
        System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < media) {
                System.out.printf("%.1f\n", vetor[i]);
            }
        }

        scanner.close();
    }
}
