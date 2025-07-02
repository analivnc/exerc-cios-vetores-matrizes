/*. Crie um programa que leia um vetor de 10 posições. Contar e escrever quantos 
valores pares e quantos valores ímpares ele possui.*/

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
     int[] valores = new int [10];
     int pares = 0;
     int impares = 0;


     for(int i = 0; i < 10; i++){
        System.out.print("Digite o valor "+ (i + 1) + ": ");
        valores [i] = scanner.nextInt();
        if(valores[i] % 2 == 0){
            pares++;
} else {
            impares++;
            
 }

     } 
        System.out.println("Quantidade de valores pares: " + pares);
        System.out.println("Quantidade de valores ímpares: " + impares);
 }


  
