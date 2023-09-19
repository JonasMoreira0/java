package application;
import java.util.Locale;
import java.util.Scanner;

import util.Product;

public class ProductStock {
    public static void main(String[] arg) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        //ADD produtos nome, preço e quantidade
        System.out.println("Issira os dados do produto: ");
        System.out.print("Nome: ");
        String name = sc.nextLine();
        System.out.print("Preço: ");
        double price = sc.nextDouble();
        Product product = new Product(name, price);

        //get e set
        product.setName("Computer");
        System.out.println("Update mame: "+ product.getName()); 
        product.setPrice(1200.00);
        System.out.println("Updade price: "+ product.getPrice());
        
        System.out.println();
        System.out.println("Informações do produto: "+ product);

        //Produtos a serem inseridos no stock
        System.out.println();
        System.out.print("Insira o números de produtos a serem adicionados ao estoque: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println();
        System.out.println("Informações do produto: "+ product);

        //Produtos a serem removidos do stock
        System.out.println();
        System.out.print("Insira o números de produtos a serem removidos ao estoque: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);
    
        System.out.println();
        System.out.println("Informações do produto: "+ product);

        sc.close();
    }
}
