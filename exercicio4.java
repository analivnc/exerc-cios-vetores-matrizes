/*. Crie um programa que lê 6 valores inteiros e, em seguida, mostre na tela os 
valores lidos na ordem inversa*/

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args){
     Scanner scanner = new Scanner(System.in);
     int[] valores = new int [6];

     for (int i = 0; i < 6; i++){
        System.out.print("Digite o valor " + (i + 1) + ": ");
        valores [i] = scanner.nextInt();
        } 
    System.out.println("Valores lidos na ordem inversa: ");
        for (int i = 5; i >= 0; i--) {
    System.out.println(valores[i]);
}

    }
}


