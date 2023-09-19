package application;

import java.util.Locale;
import java.util.Scanner;

public class aprovados {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        int n;
        double media;

        System.out.print("Quantos alunos serão digitados? ");
        n = scanner.nextInt();

        String[] nome = new String[n];
        double[] semestre1 = new double[n];
        double[] semestre2 = new double[n];

        for ( int i = 0; i < n; i ++){
            System.out.printf("Digite nome, primeira e segunda nota do %do aluno:\n", i + 1);
            scanner.nextLine();
            nome[i] = scanner.nextLine();
            semestre1[i] = scanner.nextDouble();
            semestre2[i] = scanner.nextDouble();
        }

        System.out.println("Alunos aprovados:");

        for (int i = 0; i < n; i++) {
            media = semestre1[i] + semestre2[i] / 2;

            if (media >= 6.0) {
                System.out.printf("%s\n", nome[i]);
            }
        }

        scanner.close();
    }
}
