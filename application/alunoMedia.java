package application;

import java.util.Locale;
import java.util.Scanner;

import util.aluno;

public class alunoMedia {
    public static void main(String[] arg) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        aluno aluno = new aluno();
        System.out.println("Informe o nome do aluno");
        aluno.nome = sc.nextLine();
        aluno.nota1 = sc.nextDouble();
        aluno.nota2 = sc.nextDouble();
        aluno.nota3 = sc.nextDouble();
        
        System.out.printf("FINAL GRADE %.2f%n", aluno.mediaDoTrimestre());
        
        if (aluno.mediaDoTrimestre() < 60) {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n", aluno.pontosRestantes());
        } 
        else {
            System.out.println("PASS");
        }

        sc.close();
    }
}
