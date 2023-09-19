package application;

import java.util.Locale;
import java.util.Scanner;

public class meddia_pares {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        
        int n, numeroPares, somaPares;
        double mediaPares;

        System.out.print("Quantos elementos vai ter o vetor? ");
        n = scanner.nextInt();

        double[] vetor = new double[n];
        
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = scanner.nextInt();
        }

        somaPares = 0;
        numeroPares = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0){
            somaPares += vetor[i];
            numeroPares++ ;
        }
    }
    if (numeroPares == 0) {
        System.out.println("NENHUM NUMERO PAR");
    }
    else {
        mediaPares = (double)somaPares / numeroPares;

        System.out.printf("MEDIA DOS PARES = %.1f\n", mediaPares);
    }        
        scanner.close();
    }
}
