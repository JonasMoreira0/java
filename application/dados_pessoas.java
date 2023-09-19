package application;

import java.util.Locale;
import java.util.Scanner;

public class dados_pessoas {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        
        int n, qtdhomens, qtdmulheres;
        double maior, menor, alturaTotal, alturaMedia;

        System.out.print("Quantas pessoas seram digitadas? ");
        n = scanner.nextInt();

        double[] altura = new double[n];
        char[] genero = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Altura da %da pessoa: ", i + 1);
            altura[i] = scanner.nextDouble();
            System.out.printf("Genero da %da pessoa: ", i + 1);
            genero[i] = scanner.next().charAt(0);
        }

        menor = altura[0];
        maior = altura[0];
        for (int i = 0; i < n; i++) {
            if (altura[i] < menor) { 
                menor = altura[i];
            }
            if (altura[i] > maior) {
                maior = altura[i];
            }
        }

        qtdhomens = 0;
        qtdmulheres = 0;
        alturaTotal = 0;
        for (int i = 0; i < n; i++) {
            if (genero[i] == 'M') { 
                qtdhomens++;
            }
            else {
                qtdmulheres++;
                alturaTotal += altura[i];
            }
        }

        alturaMedia = alturaTotal / qtdmulheres;

        System.out.printf("Menor altura = %.2f\n", menor);
        System.out.printf("Maior altura = %.2f\n", maior);
        System.out.printf("Media das alturas das mulheres = %.2f\n", alturaMedia);
        System.out.printf("Numero de homens = %d\n", qtdhomens);  // Correção: %d para int
    
        scanner.close();
    }
}
