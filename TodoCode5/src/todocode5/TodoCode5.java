
package todocode5;

import java.util.Scanner;

public class TodoCode5 {

    public static void main(String[] args) {
      
      Scanner leer = new Scanner(System.in);
      Scanner leer2 = new Scanner(System.in);
        
      String ciudad[] = new String [5];
      Double tmin[] = new Double [5];
      Double tmax[] = new Double [5];
      Double menor=0.0;
      Double mayor=0.0;
       
      //Leo los datos de los 3 vectores
        for (int i = 0; i < 5; i++) {
            System.out.println("");
            System.out.print("ciudad "+(i+1)+" : ");
            ciudad[i]= leer.nextLine(); 
            
            System.out.print("Temp Min.: ");
            tmin[i]= leer2.nextDouble();
            
            System.out.print("Temp Max.: ");
            tmax[i]= leer2.nextDouble();
        } 
        
        //Temperatura mas baja
        menor = tmin[0]; 
        for (int i = 1; i < 5; i++) {          
            if (tmin[i]<menor) {
               menor = tmin[i];
            }  
        }
        
        //Temperatura mas alta
        mayor = tmax[0]; 
        for (int i = 1; i < 5; i++) {          
            if (tmax[i]>mayor) {
               mayor = tmax[i];
            }  
        }

        //Escribimos ciudad mas baja con grados
        System.out.println("");
        System.out.println("*** Ciudades con la Menor Temperatura: ***");
        for (int i = 0; i < 5; i++) {
            if (tmin[i].equals(menor)) {
                System.out.println(ciudad[i]+ " con "+tmin[i]+" grados cent.");
            }
        }
        
        //Escribimos ciudad mas alta con grados
        System.out.println("");
        System.out.println("*** Ciudades con la Mayor Temperatura: ***");
        for (int i = 0; i < 5; i++) {
            if (tmax[i].equals(mayor)) {
                System.out.println(ciudad[i]+ " con "+tmax[i]+" grados cent.");
            }
        }
        
    }
    
}
