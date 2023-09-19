package application;

import java.util.Locale;
import java.util.Scanner;

public class laçoForEach {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Locale.setDefault(Locale.US);
        
    String[] vetor = new String[] {"Maria", "Bob", "Alex"};    
        for (int i=0; i< vetor.length; i++) {
            System.out.println(vetor[i]);
        }
        
        System.out.println();
    //LAÇO "for each"
    //OBJETO (obj) ex:"Maria", "Bob", "Alex" 
    for (String obj : vetor) {
        System.out.println(obj);
    }

    scanner.close();
    }
}