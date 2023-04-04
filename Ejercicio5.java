/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosGuia5;

import java.util.Random;

/**
 *
 * @author lily1
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rnd = new Random();

        int matriz[][] = new int[3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = rnd.nextInt(10) - 5;
            }
        }
        
        //Escribiendo la matriz directamente!
        //matriz[0][0] = 0;matriz[0][1] = -2;matriz[0][2] = 4;
        //matriz[1][0] = 2;matriz[1][1] = 0;matriz[1][2] = 2;
        //matriz[2][0] = -4;matriz[2][1] = -2;matriz[2][2] = 0;
        
        int traspuesta[][] = creaTranspuesta(matriz);
        System.out.println("La matriz normal es: "+ " ");
        imprimeMatriz(matriz);
        System.out.println(" ");
        System.out.println("La matriz transpuesta es: "+ " ");
        imprimeMatriz(traspuesta);
        System.out.println(" ");
        System.out.println("Es antisimetrica?: "+ esAntisimetrica(matriz, traspuesta));
    }

    public static boolean esAntisimetrica(int[][] mat, int[][] matriztrans) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] != -matriztrans[i][j]) {
                    return false;
                }

            }
        }
        return true;
    }

    public static int[][] creaTranspuesta(int[][] mat) {
        //Defini la matriz transpuesta
        int matriz[][] = new int[3][3];
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
                if (mat[i][j]<0){
                System.out.print(mat[i][j] + " ");
                }else{
                System.out.print(mat[i][j] + "  ");
                }
            }
            System.out.println();
        }
    }

}
