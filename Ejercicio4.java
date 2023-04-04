/*
 Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y 
muestre la traspuesta de la matriz. La matriz traspuesta de una matriz A se 
denota por B y se obtiene cambiando sus filas por columnas (o viceversa).

 */
package EjerciciosGuia5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Teresa
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random rnd = new Random();

        //Define matriz
        int matriz[][] = new int[4][];
        for (int i = 0; i < matriz.length; i++) {
            matriz[i] = new int[4];
        }

        //Inicializa con valores aleatorios (i: columna, j: fila)
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = rnd.nextInt(10);
            }
        }

        int[][] matrizTranspuesta = creaTranspuesta(matriz);

        //Imprime las matrices
        System.out.println("La matriz queda: ");
        imprimeMatriz(matriz);

        System.out.println("");
        System.out.println("La matriz transpuesta queda: ");
        imprimeMatriz(matrizTranspuesta);
    }

    public static int[][] creaTranspuesta(int[][] mat) {
        //Defini la matriz transpuesta
        int matriz[][] = new int[4][];
        for (int i = 0; i < matriz.length; i++) {
            matriz[i] = new int[4];
        }
        //Transpongo la matriz mat
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = mat[j][i];
            }
        }
        return matriz;
    }

    public static void imprimeMatriz(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
