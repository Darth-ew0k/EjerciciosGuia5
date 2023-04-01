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
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros a rellenar");
        int num = leer.nextInt();
        int Vector[] = new int[num];
        for (int i =0; i<Vector.length; i++){
        Vector[i] = (int)(Math.random()*9+1);
        
        }
        
        System.out.println("Ingrese el numero que desea buscar en el vector.");
        int num1 = leer.nextInt();
        int cont = 0;
        
        for (int i =0; i<Vector.length; i++){
            System.out.println("Buscando...");
            
            if(num1==Vector[i]){
                System.out.println("Casilla"+ i +": Has acertado un numero!");
                
            }else{
                System.out.println("Casilla"+ i +": No hay coincidencia aqui.");
                
            }
        }
    }
    
}
