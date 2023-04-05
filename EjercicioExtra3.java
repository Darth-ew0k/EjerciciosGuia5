/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosGuia5;

/**
 *
 * @author lily1
 */
public class EjercicioExtra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int vector [] = new int [5];
        
        rellenaVector(vector);
        imprimeMatriz(vector);
        
    }
    
    
    public static void imprimeMatriz(int[] vector) {
                System.out.println("Imprimiendo el Vector: ");
        for (int i = 0; i < vector.length; i++) {
                System.out.print("["+vector[i]+"]");
                System.out.print("  ");
                }
            }
        
    
    
    public static void rellenaVector(int[] vector) {
    
        for (int i=0; i< vector.length; i++){
           
            vector[i] = (int)(Math.random()*10+1);
        }
        
    }
}
    

    

