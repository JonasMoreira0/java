package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class lista {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        List<String> list = new ArrayList<>();
        
        list.add("Maria"); //0
        list.add("Alex"); //1
        list.add("Bob"); //3
        list.add("Anna"); //4
        //envertendo a sequencia da lista
        list.add(2, "Marco"); //2 

        //ver o tamanho da 'list' (list.size()) 
        System.out.println(list.size());
        //remover um elemento da 'list' list.remove()
        list.remove("Ana");

        for (String x : list) {
            System.out.println(x);            
        }

        System.out.println("----------------------");
        //removendo pela sequencia da lista 
        list.remove(0);
        //removendo pela primeira letra do nome
        list.removeIf(x -> x.charAt(0) == 'M');
        
        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("---------------------------");
        //encontrar a posição de um elemento
        System.out.println("Index de Bob: " + list.indexOf("Bob"));
        //encontrar uma pessoa que não está na lista
        System.out.println("Index de Marco: " + list.indexOf("Marco"));
        scanner.close();

        System.out.println("-------------------------");
        //ficar na lista so as pessoas com 'A'
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());        
        
        for (String x : result) {
            System.out.println(x);
        }

        System.out.println("---------------------");
        //Encontrar o primeiro elemento da lista
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);
        //vai voutar nulo 'null' por que não a letra 'j'
        String nome = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
        System.out.println(nome);
        
    }
}
