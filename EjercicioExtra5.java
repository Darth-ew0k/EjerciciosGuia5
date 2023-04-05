/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosGuia5;

import java.util.Scanner;

/**
 *
 * @author lily1
 */
public class EjercicioExtra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de filas y columnas de tu Matriz:");
        
        int n = leer.nextInt();int m = leer.nextInt();
        int matriz[][] = new int[n][m];
        int suma = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = (int) (Math.random() * 10 + 1);
                suma = suma + matriz[i][j];
            }
        }

        imprimeMatriz(matriz, suma);

    }

    public static void imprimeMatriz(int[][] mat, int suma) {

        System.out.println("Imprimiendo su Matriz...");

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print("[" + mat[i][j] + "]" + "  ");

            }
            System.out.println();
        }
        System.out.println("Y la suma de todos sus elementos es:");
        System.out.println(suma);
    }

}
