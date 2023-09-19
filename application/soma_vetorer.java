package application;

import java.util.Locale;
import java.util.Scanner;

public class soma_vetorer {
    public static void main(String[] args){
    Locale.setDefault(Locale.US);
    Scanner scanner = new Scanner (System.in);

    int n;

    System.out.print("Quantos valores vai ter cada vetor? ");
    n = scanner.nextInt();

    System.out.println("Digite os valores do vetor 'A': ");
        int[] vetorA = new int[n];    
        
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = scanner.nextInt(); 
        }
    
    System.out.println("Digite os valores do vetor 'B': ");    
        int[] vetorB = new int[n];
        
        for (int i = 0; i < vetorB.length; i++) {            
            vetorB[i] = scanner.nextInt();
    }    
    
    System.out.println("VETOR RESULTANTE: ");
        int[] vetorC = new int[n];
        
        for (int i = 0; i < vetorC.length; i++) {
            vetorC[i] = vetorA[i] + vetorB[i];     
        }

        for (int i = 0; i < vetorC.length; i++) {
            System.out.printf("%d\n",vetorC[i]);
        }
    scanner.close();    
}
}