package application;

import java.util.Locale;
import java.util.Scanner;

import util.Conta;

public class ContaBancaria {
    public static void main(String[] arg){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        //Dados do cadastro
        System.out.print("Entra com o número da conta: ");
        int numeroDaConta = sc.nextInt();
        System.out.print("Nome do titular da conta: ");
        sc.nextLine();
        String nome = sc.nextLine();
        System.out.print("Existe um deposito inicial (s/n)? ");
        char deposito = sc.next().charAt(0);
        
        //Vai abria a conta s/n
        Conta conta;
        if (deposito == 's') {
            System.out.print("Valor do deposito: ");
            double valorDepositado = sc.nextDouble();
            conta = new Conta(numeroDaConta, nome, valorDepositado);
        }
        else{
            conta = new Conta(numeroDaConta, nome);
        }
        
        //Dados da conta
        System.out.println();
        System.out.println("Dados da conta: ");
        System.out.println(conta);

        //Deposito
        System.out.println();
        System.out.print("Insira o valor a ser depositado: ");
        double valorDepositado = sc.nextDouble();
        conta.deposito(valorDepositado);
        System.out.println("Dados da conta atualizados: ");
        System.out.println(conta);

        //Saque
        System.out.println();
        System.out.print("Insira o valor a ser retirado: ");
        valorDepositado = sc.nextDouble();
        conta.saque(valorDepositado);
        System.out.println("Dados da conta atualizados: ");
        System.out.println(conta);


        sc.close();
}
}
