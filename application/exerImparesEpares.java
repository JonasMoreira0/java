package application;
import java.util.Locale;
import java.util.Scanner;

public class exerImparesEpares {
        public static void main(String[] arg) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int j = 0;
        System.out.println("Numeros impares e pares");
        for (int i=1; i<=10; i+=2 ){
                System.out.println("Impar "+ i +" Para "+j);
            j+=2;
        }
    sc.close();
}
}