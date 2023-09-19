package application;

import java.util.Locale;
import java.util.Scanner;

class DadosDaPessoa {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();

        String[] Nome = new String[n];
        int[] Idade = new int[n];
        double[] Altura = new double[n];
        
        for (int i = 0; i < n; i++) {
            System.out.printf("Dados da " + (i+1) + "a pessoas: \n");
            System.out.print("Nome: ");
            Nome[i] = sc.next();
            System.out.print("Idede: ");
            Idade[i] = sc.nextInt();
            System.out.print("Altura: ");
            Altura[i] = sc.nextDouble(); 
        }

        double soma = 0.0;
        for (int i = 0; i < n; i++) {
            soma =+ Altura[i];
        }
        double alturaMedia = soma / n;
        
        System.out.println();
        System.out.printf("2Altura média: %.2f\n", alturaMedia);
        
        int cont =0;
        for (int i = 0; i < n; i++) {
            if (Idade[i] < 16) {
                cont =+ 1;
            }
        }

        double percent = cont * 100.0 / n;

        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", percent);
        
        for (int i=0; i<n; i++) {
            if (Idade[i] < 16) {
                System.out.println(Nome[i]);
            }
        }
        sc.close();
    }
}