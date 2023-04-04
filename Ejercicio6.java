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
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int matriz[][] = new int[3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("Ingresa un numero");
                do {
                    matriz[i][j] = leer.nextInt();
                } while (!(matriz[i][j] > 0 && matriz[i][j] < 10));
            }
        }
        System.out.println("La matriz ingresada es: ");
        imprimeMatriz(matriz);
        System.out.println(" ");
        System.out.println("La matriz ingresada es magica?: " + esCuboMagico(matriz));

    }

    public static boolean esCuboMagico(int[][] matriz) {

        int suma;
        suma = 0;

        for (int j = 0; j < matriz[0].length; j++) {
            suma += matriz[0][j];
        }
        //comprobamos que la suma de las filas sean iguales!
        for (int i = 0; i < matriz.length; i++) {
            int aux = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                aux += matriz[i][j];
            }
            if (aux != suma) {
                return false;
            }
        }
        //comprobamos que la suma de las columnas sean iguales!
        for (int i = 0; i < matriz.length; i++) {
            int aux = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                aux += matriz[j][i];
            }
            if (aux != suma) {
                return false;
            }
        }
        //comprobamos la diagonal principal!
        int aux = 0;
        for (int j = 0; j < matriz.length; j++) {
            aux += matriz[j][j];
        }
        if (aux != suma) {
            return false;
        }
        //comprobamos la diagonal secundaria!
        aux = 0;
        for (int j = 0; j < matriz.length; j++) {
            aux += matriz[j][matriz.length-j-1];
        }
        if (aux != suma) {
            return false;
        }
        return true;
    }

    public static void imprimeMatriz(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] < 0) {
                    System.out.print(mat[i][j] + " ");
                } else {
                    System.out.print(mat[i][j] + "  ");
                }
            }
            System.out.println();
        }
    }

}
