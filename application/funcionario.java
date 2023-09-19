package application;

import java.util.Locale;
import java.util.Scanner;

import util.func;

public class funcionario {
    public static void main(String[] arg) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        func funcionario = new func();
        System.out.print("Name: ");
        funcionario.Name = sc.nextLine();
        System.out.print("Gross salary: ");
        funcionario.GrossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        funcionario.Tax = sc.nextDouble();

        System.out.println();
        System.out.println("Employee: "+ funcionario);
        
        System.out.println();
        System.out.print("Which percentage to increase salary? ");
        double increaseSalary = sc.nextDouble();
        funcionario.salarioBruto(increaseSalary);

        System.out.println("Updated data: "+ funcionario);


        sc.close();
    }
}
