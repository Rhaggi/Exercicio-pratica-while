/* Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema 
cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo 
menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma). */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int coordenadaX = sc.nextInt();
        int coordenadaY = sc.nextInt();
        
        while(coordenadaX != 0 && coordenadaY != 0 ){
            if (coordenadaX > 0 && coordenadaY > 0) {
                System.out.println("1° quadrante");
            } else if(coordenadaX < 0 && coordenadaY > 0) {
                System.out.println("2° quadrante");
            } else if (coordenadaX < 0 && coordenadaY < 0 ){
                System.out.println("3° quadrante");
            } else if(coordenadaX > 0 && coordenadaY < 0){
                System.out.println("4° quadrante");
            }
            coordenadaX = sc.nextInt();
            coordenadaY = sc.nextInt();
        }
        
        sc.close();
    }
}