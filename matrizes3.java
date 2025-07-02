/*. Crie em Java uma matriz 4x4 de decimais, preencha a matriz e depois: 
a) Exiba os valores da sua diagonal principal; 
b) Exiba os valores da sua diagonal secundária; 
c) A sua matriz transposta.*/


public class matrizes3 {
    public static void main(String[] args) {

        int[][] matriz = new int[4][4];

        // Preencher a matriz
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = (int)(Math.random() * 101);
            }
        }

        // Matriz
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("\t" + matriz[i][j]);
            }
            System.out.println("x:");
        }

        // Diagonal Principal (índice linha == coluna)
        System.out.println("\nDiagonal Principal:");
        for (int i = 0; i < 4; i++) {
            System.out.println(matriz[i][i] + " ");
        }

        // Diagonal Secundária (índice linha + coluna == tamanho - 1)
        System.out.println("\nDiagonal Secundária:");
        for (int i = 0; i < 4; i++) {
            System.out.println(matriz[i][3 - i] + " ");
        }

        // Matriz Transposta
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("\t" + matriz[j][i]);
            }
            System.out.println();
        }
    }
}
