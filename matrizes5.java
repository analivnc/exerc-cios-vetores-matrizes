/* Crie em Java uma matriz 3x3 de inteiros, preencha a matriz e verifique se a matriz
é um quadrado mágico. Diz-se que uma matriz é um quadrado mágico quando a
soma de todas as suas linhas, todas as suas colunas, sua diagonal principal e sua
diagonal secundária resultam no mesmo valor. Exemplo abaixo
*/
 
 
public class matrizes5 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
 
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = (int)(Math.random() * 11);
            }
        }
 
        // Mostrar a matriz e somar as linhas
        System.out.println("Matriz e soma das linhas:");
        for (int i = 0; i < 3; i++) {
            int somaLinha = 0;
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + "\t");
                somaLinha += matriz[i][j];
            }
            System.out.println("| Soma da linha " + i + ": " + somaLinha);
        }
 
        // Somar as colunas
        System.out.println("\nSoma das colunas:");
        for (int j = 0; j < 3; j++) {
            int somaColuna = 0;
            for (int i = 0; i < 3; i++) {
                somaColuna += matriz[i][j];
            }
            System.out.println("Soma da coluna " + j + ": " + somaColuna);
        }
 
        // Verificar se é um quadrado mágico
        int somaReferencia = matriz[0][0] + matriz[0][1] + matriz[0][2];
        boolean verifica = true;
 
        // Verificar soma das linhas
        for (int i = 0; i < 3; i++) {
            int somaLinha = 0;
            for (int j = 0; j < 3; j++) {
                somaLinha += matriz[i][j];
            }
            if (somaLinha != somaReferencia) {
                verifica = false;
                break;
            }
        }
 
        // Verificar soma das colunas
        if (verifica) {
            for (int j = 0; j < 3; j++) {
                int somaColuna = 0;
                for (int i = 0; i < 3; i++) {
                    somaColuna += matriz[i][j];
                }
                if (somaColuna != somaReferencia) {
                    verifica = false;
                    break;
                }
            }
        }
 
        // Verificar a diagonal principal
        if (verifica) {
            int somaDiagonalPrincipal = 0;
            for (int i = 0; i < 3; i++) {
                somaDiagonalPrincipal += matriz[i][i];
            }
            if (somaDiagonalPrincipal != somaReferencia) {
                verifica = false;
            }
        }
 
        // Verificar a diagonal secundária
        if (verifica) {
            int somaDiagonalSecundaria = 0;
            for (int i = 0; i < 3; i++) {
                somaDiagonalSecundaria += matriz[i][2 - i];
            }
            if (somaDiagonalSecundaria != somaReferencia) {
                verifica = false;
            }
        }
 
        System.out.println();
        if (verifica) {
            System.out.println("E um quadrado magico!");
        } else {
            System.out.println("Nao e um quadrado magico.");
        }
    }
}
 
 