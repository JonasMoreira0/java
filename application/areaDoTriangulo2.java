package application;
import java.util.Locale;
import java.util.Scanner;

import util.triangulo;
/*
PROBLEMA SEM ORIENTAÇÃO A OBJETOS
Fazer um programa para ler as medidas dos lados de dois triângulos X e Y (suponha medidas
válidas). Em seguida, mostrar o valor das áreas dos dois triângulos e dizer qual dos dois triângulos
possui a maior área.
A fórmula para calcular a área de um triângulo a partir das medidas de seus lados a, b e c é a
seguinte (fórmula de Heron):
 */
public class areaDoTriangulo2 {
        public static void main(String[] arg) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        triangulo x, y;
        x = new triangulo();
        y = new triangulo();

        System.out.println("informe o valor do triagulo x: ");
        x.a = sc.nextDouble();   
        x.b = sc.nextDouble();    
        x.c = sc.nextDouble();
        System.out.println("Informe o valor do triangulo y:");       
        y.a = sc.nextDouble();   
        y.b = sc.nextDouble();    
        y.c = sc.nextDouble();
        
        double areaX = x.area();
        double areaY = y.area();
        
        System.out.printf("Triangulo X area: %.4f%n", areaX);
        System.out.printf("Triangulo Y area: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Largura da area: X");
        } else {
            System.out.println("Largura da area: y");
        }
        sc.close();
    }

}
