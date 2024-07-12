
package todocode3;

import java.util.Scanner;


public class TodoCode3 {

    public static void main(String[] args) {
       
       //Vectores
       int vector[] = new int[4];
       Scanner leer = new Scanner(System.in);
       
        System.out.println("*** VECTORES ***");
        //Llenado Vector
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Ingrese Valor de la Posicion "+i+": ");
            vector[i] = leer.nextInt();
        }
        
        System.out.println("");
        System.out.println("El Vector Cargado es: ");
        System.out.println("");
        
        //Mostrar el vector
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Posicion: "+i);
            System.out.println("  - Valor: "+vector[i]);
        }
        
        System.out.println("");
        System.out.println("*** MATRICES ***");
        System.out.println("");
        //Matrices
        
        int matriz [] [] = new int [3] [3];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                 System.out.print("Ingrese Valor Posicion "+i+" - "+j+": ");
                 matriz[i][j] = leer.nextInt();
            } 
        }  
        
        System.out.println("");
        System.out.println("La Matriz Cargada es: ");
        System.out.println("");
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                 System.out.print(matriz[i][j]);
                 System.out.print(" ");
            } System.out.println(" ");
        }    
        
        System.out.println("");
        System.out.println("La Matriz Inversa (col x fil) Cargada es: ");
        System.out.println("");
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                 System.out.print(matriz[j][i]);
                 System.out.print(" ");
            } System.out.println(" ");
        }  

    }
    
}
