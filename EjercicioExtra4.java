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
public class EjercicioExtra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Los profesores del curso de programación de Egg necesitan llevar un 
        //registro de las notas adquiridas por sus 10 alumnos para luego obtener
        //una cantidad de aprobados y desaprobados. Durante el período de cursado
        //cada alumno obtiene 4 notas, 2 por trabajos prácticos evaluativos y 2 
        //por parciales. Las ponderaciones de cada nota son:
            //Primer trabajo práctico evaluativo 10%
            //Segundo trabajo práctico evaluativo 15%
            //Primer Integrador 25%
            //Segundo integrador 50%
        //Una vez cargadas las notas, se calcula el promedio y se guarda en el 
        //arreglo. Al final del programa los profesores necesitan obtener por 
        //pantalla la cantidad de aprobados y desaprobados, teniendo en cuenta 
        //que solo aprueban los alumnos con promedio mayor o igual al 7 de sus 
        //notas del curso.
          Scanner leer = new Scanner(System.in);
        
        int[][] notas = new int[10][4];
        for (int i = 0; i < 10; i++) {
             System.out.println("Ingrese las notas del alumno: " + (i +1));
             for (int j = 0; j < 4; j++) {
                System.out.println("Ingrese la nota " + (j +1));
                notas[i][j]= leer.nextInt();
            }
             
        }
        double [] promedio = new double [10];
        for (int i = 0; i < 10; i++) {
            promedio[i]= notas[i][0]*0.1 + notas[i][1]*0.15 + notas[i][2]*0.25
                    + notas[i][3]*0.50;
        }
        int cont = 0;
        for (int i = 0; i < 10; i++) {
            if(promedio[i]>=7){
                 System.out.println("El alumno: " + (i +1) + " Aprobó");
                 cont++;
            } else {
                System.out.println("El alumno: " + (i +1) + " No aprobó");
            }
         
        }
        System.out.println("La cantidad de alumnos aprbado es:" + cont);
        System.out.println("La cantidad de alumnos desaprbado es:" + (10-cont));
    }

    }

