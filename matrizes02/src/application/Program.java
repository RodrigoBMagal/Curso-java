package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantia de linhas da matriz: ");
        int linhas = sc.nextInt();
        System.out.println("Digite a quantia de colunas da matriz: ");
        int colunas = sc.nextInt();

        int [][] matriz = new int[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }
        int contador = sc.nextInt();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == contador) {
                    System.out.println("Posição: " + i + "," + j);
                    if (j > 0) {
                         System.out.println("Esquerda: " + matriz[i][j-1]);
                     }
                    if (j < matriz[i].length-1) {
                        System.out.println("Direita: " + matriz[i][j+1]);
                    }
                    if (i > 0) {
                        System.out.println("Cima: " + matriz[i-1][j]);
                    }
                    if (i < matriz.length-1) {
                        System.out.println("Baixo: " + matriz[i +1][j]);
                    }
                }
            }
        }
        sc.close();
    }
}
