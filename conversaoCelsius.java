/* Programa que converte de Celsius para Fahreheit enquanto o usuário clica para repetir o programa */

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        char resposta;
        
        do {
            System.out.println("Digite a temperatura em Celsius:");
            double celsius = sc.nextDouble();
            double fahrenheit = (celsius * 9.0) / 5.0 + 32.0;
            System.out.printf("Equivalente em fahrenheit: %.1f%n", fahrenheit);
            System.out.print("Deseja repetir? (s/n) ");
            resposta = sc.next().charAt(0);
        } while (resposta != 'n');
        
        sc.close();
    }
}