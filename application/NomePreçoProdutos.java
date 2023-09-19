package application;

import java.util.Locale;
import java.util.Scanner;

import util.Produtos;

public class NomePreçoProdutos {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("INFORME A AQUANTIDADE DE PRODUTOS: ");
        int n = sc.nextInt();
        System.out.println("IMFORME O NOME E O PREÇO DO PRODUTO:  ");
        
        Produtos[] vetor = new Produtos[n];
       
        for (int i = 0; i < vetor.length; i++) {
            sc.nextLine();
            String nome = sc.nextLine();
            double preço = sc.nextDouble();
            vetor[i] = new Produtos(nome, preço);
        }
        
        double soma = 0.0;
            for (int i = 0; i < vetor.length; i++) {
                soma += vetor[i].getPreço();
            }
            double preço = soma / vetor.length;
            System.out.printf("PREÇO MÉDIO: %.2f%n", preço);
            sc.close();
    }
}
