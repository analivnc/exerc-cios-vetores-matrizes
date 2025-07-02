// Faça um programa que receba do usuário um vetor com 10 posições. Em seguida 
//deverá ser impresso o maior e o menor elemento do vetor.

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int[] vetor = new int[10];

    for(int i = 0; i < 10; i++){
        System.out.print("Digite o valor " + (i + 1) + "º número: ");
            vetor[i] = scanner.nextInt();
        }

        int maior = vetor[0];
        int menor = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }

        
    System.out.println("\nMaior número: " + maior);
    System.out.println("Menor número: " + menor);

     }
}
