
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int combustivel = sc.nextInt();
        int alcool, gasolina, diesel;
        
        alcool = 0;
        gasolina = 0;
        diesel = 0;
        
        while (combustivel != 4) {
            if (combustivel == 1) {
                alcool = alcool + 1;
            } else if (combustivel == 2) {
                gasolina = gasolina + 1;
            } else if (combustivel == 3) {
                diesel = diesel + 1;
            }
            combustivel = sc.nextInt();
        }
        
        System.out.println("Muito obrigada!");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
        
        sc.close();
    }
}