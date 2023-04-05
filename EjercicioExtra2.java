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
public class EjercicioExtra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        int Vector[] = new int[5];
        int Vector1[] = new int[5];
        
        for (int i=0; i<Vector.length; i++){
            System.out.println("Ingrese un numero para el slot "+ i);
            Vector[i]= leer.nextInt();
        }
        for (int i=0; i<Vector1.length; i++){
            System.out.println("Ingrese un numero para el slot "+ i);
            Vector1[i]= leer.nextInt();
        }
        for (int i=0; i<Vector.length;i++){
            if(Vector[i]!= Vector1[i]){
                System.out.println("Slot "+ i +" concuerdan.");
            }else{
                System.out.println("En el slot "+ i +" hay una discrepancia.");
            }
        }
    }
    
}
