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
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int Vector[] = new int[5];
        int Vector1[] = new int[5];
        for (int i = 0; i<Vector.length; i++){
            Vector[i] = (int)(Math.random()*50000+1);
            Vector1[i] = Vector[i];
            System.out.println(Vector[i]);
        }
        
        int contador = 0;
        
        for (int i = 0; i<Vector.length; i++) {
            
            contador = 0;
            do{
            Vector[i] = Vector[i]/10;
            contador = contador + 1;
            }while(Vector[i]!=0);
            
            System.out.println("El numero "+ Vector1[i] +" tiene un total de "+ contador +" digitos.");
        
        }
       
    }
    
}
