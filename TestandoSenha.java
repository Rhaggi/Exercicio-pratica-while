/* Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha 
incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser 
impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002. */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int senha = 2002;
        int login = sc.nextInt();
        
        while (login != senha) {
            System.out.println("Senha invalida");
            login = sc.nextInt();
        }
        System.out.println("Acesso permitido!");

        sc.close();
    }
}