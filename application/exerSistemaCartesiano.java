package application;

import java.util.Locale;
import java.util.Scanner;
//Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema 
//cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo 
//menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).
public class exerSistemaCartesiano {
    
    public static void main(String[] arg){
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    System.out.println("informe o valor de x e y ");
    int x = sc.nextInt();
    int y = sc.nextInt();
    while (x != 0 && y != 0) {
        if (x < y && x > y) {
            System.out.println("quarto" );            
        } 
        else if (x > y && x < y) {
            System.out.println("primeiro");
        }
        else if (x < y && x < y) {
            System.out.println("segundo");
        }
        else if (x > y && x > y) {
            System.out.println("terceiro");
        }
        x = sc.nextInt();
        y = sc.nextInt();
    }
    System.out.println("encerrou!");
    sc.close();
    }
}
