package application;
import java.util.Locale;
import java.util.Scanner;

import util.retangulo;

public class areaRetangulo {
    public static void main(String[] arg) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        retangulo x;
        x = new retangulo();   

        System.out.println("Insira a largura e a altura do retângulo");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        
        double areaX = x.area();
        System.out.printf("AREA = %.2f%n", areaX);
        System.out.printf("PERIMETER = %.2f%n", areaX);
        System.out.printf("DIAGONAL = %.2f%n", areaX);

        sc.close();
    }
}
