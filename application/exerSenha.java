package application;
import java.util.Locale;
import java.util.Scanner;

//Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha 
//incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser 
//impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002
public class exerSenha {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a senha:");
        int senha = 2002;
        int  y = sc.nextInt();
        while (y != 2002) {
            senha = senha + y;
            System.out.println("senha invalida");
            y = sc.nextInt();
        }
        System.out.println("acesso permitido");
        sc.close();   
    }
}
