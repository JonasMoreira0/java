package application;

import java.util.Locale;
import java.util.Scanner;

public class mais_velho {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        int pessoa, maiorIdade;

        System.out.print("Quantas pessoas você vai digitar? ");
        pessoa = scanner.nextInt();

        String[] nome = new String[pessoa];
        int[] idade = new int[pessoa];

        for (int i = 0; i < pessoa; i++) {
            System.out.printf("Dados da %da pessoa:\n", i + 1);
            System.out.print("Nome: ");
            nome[i] = scanner.next();
            System.out.print("Idade: ");
            idade[i] = scanner.nextInt();
        }
        maiorIdade = idade[0];
        int posicaoMaior = 0;
        for (int i = 0; i < pessoa; i++) {
            if (idade[i] > maiorIdade) {
                maiorIdade = idade[i];
                posicaoMaior = i; 
            }
        }
        System.out.printf("PESSOA MAIS VELHA %s\n", nome[posicaoMaior]);
        scanner.close();
    }
}
