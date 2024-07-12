
package todocode2;

import java.util.Scanner;

public class TodoCode2 {

    public static void main(String[] args) {
       
        System.out.println("Ingrese cuantos niveles debe ser el arbolito: ");
        Scanner leer = new Scanner (System.in);
        int nivel = leer.nextInt();
        
        //Arbol de Navidad
        for (int i = 0; i < nivel; i++) {
                     
            //Espacio
            for (int k = 0; k < (nivel-i-1); k++) {
                System.out.print(" "); 
            } 

            //Asterisco
            for (int j = 0; j < (i*2)+1; j++) {
                System.out.print("*"); 
            }  
           
            System.out.println("");
        }
        
        //Base Arbolito
        int baseT = 2;
        for (int base = 0; base < baseT; base++) {
            //Espacio
            for (int espacio = 0; espacio < nivel-2 ; espacio ++) {
               System.out.print(" "); 
           }
            //Tronco
            for (int tronco = 0; tronco < 3  ; tronco ++) {
               System.out.print("|"); 
           } 
            
            System.out.println("");
            
        } System.out.println("");
    }
}
