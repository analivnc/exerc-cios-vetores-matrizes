/*. Crie um programa que le 6 valores inteiros e, em seguida, mostre na tela os 
valores lidos.*/

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args){
     Scanner scanner = new Scanner(System.in);
     int[] valores = new int [6];

     for(int i = 0; i < 6; i++){
        System.out.println("Digite os valores " + (i + 1 ) + ": ");
        valores [i] = scanner.nextInt();
     }
        System.out.println("\nValores lidos:");
            for (int i = 0; i < 6; i++){
            System.out.println(valores [i] + " ");
     }
   }
}
