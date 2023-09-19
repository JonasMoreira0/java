//Utilisando menbros estáticos (static)
package application;

import java.util.Locale;
import java.util.Scanner;

import util.ComverterDollar;
public class Converter {
    
    public static void main(String[] arg) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Qual o preço do dolar?");
        double dollarPreço = sc.nextDouble();
        System.out.println("Quantos dollar você vai comprar?");
        double valor = sc.nextDouble();
        //converter dollar
        double result = ComverterDollar.dollarToReal(valor, dollarPreço);
        System.out.printf("Valor a ce pago em reais = %.2f%n", result);

        sc.close();
    }
}
