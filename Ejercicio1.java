/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemplosGuia5;

import java.util.Scanner;

/**
 *
 * @author lily1
 */
public class Ejemplo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int Vector[] = new int[100];
        
        for (int i=0; i<100;i++){
        Vector[i] = i+1;
        }
        for (int i=99; i>=0; i--){
          System.out.println(Vector[i]);
          
    }
    }
    
}
