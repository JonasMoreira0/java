package application;

import java.util.Locale;
import java.util.Scanner;

import util.Quarto;

public class QuartoEstudantes {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
         
        //VETOR NA POSIÇÃO '10'
        Quarto[]vetor = new Quarto[10];

        System.out.print("Quantos quartos vai se alugado?: ");
        int n = scanner.nextInt();
          
        for (int i = 1; i <=n; i++) {
            System.out.println();// PARA TER QUEBRA DE LINHA
            System.out.println("Aluguel#" + i + ":"); 
            System.out.print("Informe o nome do aluno: ");
            scanner.nextLine();// PARA TER QUEBRA DE LINHA
            String nome = scanner.nextLine();
            System.out.print("Informe o e-mail: ");
            //como o e-mailn tem espasso em branco pode usar o 'NEXT'
            String email = scanner.next();
            System.out.print("Informe o numerodo quarto: ");
            int quartoNumero = scanner.nextInt();
            
            //ESTÁCIO O OBJETO E ATRIBUI A SUA POSIÇÃO 
            //para poder imprimir
            // PARA USAR O toStrin: 'Quarto quarto = new Quarto();'
            vetor[quartoNumero] = new Quarto(nome, email);
        }
        
        System.out.println();
        System.out.println("Quartos ocupados:");
        
        for (int i = 0; i < 10; i++) {
            //PARA NÃO IMPRIMIR 'null' if(vetor[i] != null)
            if(vetor[i] != null) {
            System.out.println(i + ": " + vetor[i]);
            }
        }
        scanner.close();
    }
}
