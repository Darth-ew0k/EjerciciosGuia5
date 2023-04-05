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
public class EjercicioExtra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de numeros a ingresar: ");
        
        int num = leer.nextInt();
        int Vector[]= new int[num];
        int suma = 0;
        
        for (int i=0 ; i< num; i++){
            System.out.println("Ingresa un numero: ");
            Vector[i] = leer.nextInt();
            suma= suma+Vector[i];
        }
        System.out.println("La suma total de los vectores es: "+ suma);
    }
    
}
