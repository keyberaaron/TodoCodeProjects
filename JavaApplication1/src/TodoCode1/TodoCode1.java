
package TodoCode1;

import java.util.Scanner;

public class TodoCode1 {

    public static void main(String[] args) {
       
        System.out.println("Ingrese DNI: ");
        Scanner leer = new Scanner (System.in);
        String dni = leer.nextLine();
        
        System.out.println("Ingrese Nombre: ");
        String nombre = leer.nextLine();
        
        System.out.println("Ingrese Edad: ");
        Scanner leer2 = new Scanner (System.in);
        int edad = leer2.nextInt();
        
        while (!(dni.equals("0")) && !(nombre.equalsIgnoreCase("fin"))) {
        //indica que para que continue el mientas, el dni y el nombre deben ser valores permitidos
        //si alguno de los dos toma el valor de la negacion, o ambos inclusive, sale del mientras
            if (edad >= 6 && edad <=10) {
                System.out.println("La categoria es Menores A");    
            }
            else {
              if (edad >= 11 && edad <=17) {
                System.out.println("La categoria es Menores B"); 
                
              }
              else {
                if (edad >= 18 && edad <=30) {
                   System.out.println("La categoria es Juvenil"); 
                }
                else {
                  if (edad >= 30 && edad <=50) {
                     System.out.println("La categoria es Adulto"); 
                  }
                  else {
                    if (edad >=51) {
                        System.out.println("La categoria es Adulto Mayor"); 
                    }
                    else
                       System.out.println("La Persona no cuenta con una edad permitida.");  
                  }
                } 
              }
            }
            
            System.out.println("Ingrese DNI: ");
            dni = leer.nextLine();
        
            System.out.println("Ingrese Nombre: ");
            nombre = leer.nextLine();
        
            System.out.println("Ingrese Edad: ");
            edad = leer2.nextInt();
        } 
    }  
}
