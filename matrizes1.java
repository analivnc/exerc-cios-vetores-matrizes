/*1. Faça um algoritmo que preencha uma matriz 5x5 de inteiros e escreva: 
a) a soma dos números ímpares fornecidos; 
b) a soma de cada uma das 5 colunas; 
c) a soma de cada uma das 5 linhas.*/

public class matrizes1 {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = (int)(Math.random() * 11);
            }
        }

     
        System.out.println("Matriz:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("\t" + matriz[i][j]);
            }
            System.out.println(); 
        }

       
        System.out.println("\nSoma de cada linha:");
        for (int i = 0; i < 5; i++) {
            int somaLinha = 0;
            for (int j = 0; j < 5; j++) {
                somaLinha += matriz[i][j];
            }
            System.out.printf("Linha %d: %d\n", i, somaLinha);
        }
        int somaImpar = 0;
        for(int i = 0; i < 5; i++){
        for (int j = 0; j < 5; j++) {
            if (matriz [i][j] % 2 != 0){
                somaImpar += matriz [i][j];
            }
        }

    }
    System.out.println("soma dos impares : " + somaImpar);
}

}
