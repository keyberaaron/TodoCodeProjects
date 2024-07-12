
package todocode4;

import java.text.DecimalFormat;
import java.util.Scanner;


public class TodoCode4 {


    public static void main(String[] args) {
        
       double control [][] = new double [4][4];
       Scanner leer = new Scanner (System.in);
       double prom = 0.0;
  
       
       for (int i = 0; i < 4; i++) {
          
            System.out.println("Alumno "+(i+1)+" :");
            for (int j = 0; j < 3; j++) {
               
                System.out.print("Ingrese Nota "+(j+1)+" : ");
                control[i][j] = leer.nextInt();
                prom = prom + control[i][j];    
            } System.out.println("");
            control[i][3] = prom/3;
            prom=0.0;
        }
  
        System.out.println("");
        System.out.println("Notas y Promedio 4 Alumnos: ");
        System.out.println("");

        for (int i = 0; i < 4; i++) {
          
            System.out.println("Alumno "+(i+1)+" :");
            for (int j = 0; j < 4; j++) {
                if (j<3) { 
                    System.out.print("Nota "+(j+1)+" : "+control[i][j]+" |");
                } 
                else {
                      if (j==3) {
                        //Utilizo la funcion Decimal Format para redondear los decimales a 2  
                        DecimalFormat df =new DecimalFormat("0.00");
                        System.out.print("Promedio: "+df.format(control[i][j]));  
                    }
                }
            } System.out.println(""); System.out.println(""); 
        }   
       
    }
}
