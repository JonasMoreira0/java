/**Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela 
o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento, 
considerando a primeira posição como 0 (zero).**/ 
package application;

import java.util.Locale;
import java.util.Scanner;

public class maior_posição {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        
        int n, posicaoMaior;
        double maior;

        System.out.print("Quantos numeros você quer digitar: ");
        n = scanner.nextInt();

        double[] vetor = new double[n];        
        
        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = scanner.nextDouble();
        }        
        maior = vetor[0];
        posicaoMaior = 0;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maior ) {
                maior = vetor[i];
                posicaoMaior = i;
            }
        }
        System.out.printf("O MAIOR VALOR = %.1f\n", maior);
        System.out.printf("POSIÇÃO DO MAIOR VALOR = %d\n", posicaoMaior);
        scanner.close();
    }
}
