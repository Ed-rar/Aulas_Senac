package algoritmos;

import java.util.Random;
import java.util.Scanner;

public class Algoritmos {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o numero de linhas: ");
        int linhas = input.nextInt();

        System.out.println("Digite o numero de colunas: ");
        int colunas = input.nextInt();

        int matriz1[][] = geraMatriz(linhas, colunas);

        for (int i = 0; i < matriz1.length; i++) { // anda na linha
            for (int j = 0; j < matriz1[0].length; j++) { // anda na coluna
                System.out.print(matriz1[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static int[][] geraMatriz(int linhas, int colunas) {
        int matriz[][]= new int [linhas][colunas];
        
        Random rnd = new Random();
    
        for (int i = 0; i <matriz.length; i++) {
            for (int j = 0; j<matriz[i].length; j++){
                matriz[i][j]= rnd.nextInt(101);
            }
        }
        return matriz;
    }
}
