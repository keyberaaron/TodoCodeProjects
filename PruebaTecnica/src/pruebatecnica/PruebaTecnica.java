
package pruebatecnica;

import java.util.Scanner;

public class PruebaTecnica {

    public static void main(String[] args) {
       
       String Teatro [] [] = new String [10] [10]; 
       Scanner leer = new Scanner(System.in);
       int res = 0; 
       int fila, asiento;
       
       //Llenado inicial matriz
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                Teatro[i][j]="L";
            }
        }
    
       while (res != 3) {
           System.out.println("");
           System.out.println(" _____________________________ ");
           System.out.println("|   SISTEMA DE RESERVACION    |");
           System.out.println(" ----------------------------- ");
           System.out.println("|        MENU PRINCIPAL       |");
           System.out.println(" ----------------------------- ");
           System.out.println("| [1] - Reservar Asiento      |");
           System.out.println("| [2] - Mostrar Mapa Teatro   |");
           System.out.println("| [3] - Salir                 |");
           System.out.println(" ----------------------------- ");
           System.out.println("");
           System.out.print("Seleccione una opcion numerica del menu: ");
           res = leer.nextInt();
           
              switch (res) {
              
                  case 1: 
                      System.out.print("Indique Nº Fila a Seleccionar (1 a 10): ");
                      fila = leer.nextInt();
                      
                      if (fila>=1 && fila<=10) {
                          System.out.print("Indique Nº Asiento a Seleccionar (1 a 10): ");
                          asiento = leer.nextInt();
                          fila = fila-1;
                          
                          if (asiento>=1 && asiento<=10) {
                              asiento = asiento-1;
                              
                              for (int i = 0; i < 10; i++) {
                                  for (int j = 0; j < 10; j++) {
                                      if ((i == fila) && (j == asiento)) {
                                          if (Teatro[i][j].equals("L")) {
                                              Teatro[i][j]="X";
                                              System.out.println("");
                                              System.out.println("Asiento Reservado con Exito!");      
                                          }
                                          else {
                                              System.out.println("");
                                              System.out.println("Disculpe, el asiento seleccionado se encuentra ocupado.");
                                              System.out.println("Intente nuevamente con otro asiento distinto.");
                                              System.out.println("");
                                          }                                                                                        
                                      }
                                  }
                              }
                          }
                          else {
                              System.out.println("Error, introdujo un valor fuera del rango.");      
                          }
                      }
                      else {
                          System.out.println("Error, introdujo un valor fuera del rango.");
                      }
                      break;
                      
                  case 2: 
                      MostrarTeatro(Teatro);
                      System.out.println("Pulse Enter para continuar...");
                      leer.nextLine();
                      leer.nextLine();
                      break;
                       
                  case 3: 
                      System.out.println("");
                      System.out.println("Gracias por Acceder, Hasta la Proxima!");
                      System.out.println("");
                      break;
                          
                  default: System.out.println("Error, introdujo un valor fuera del rango.");
              }       
       }   
  
    } 
    
    static void MostrarTeatro (String Teatro[][]) {
           
        System.out.println("");
        System.out.println("[-------------- Mapa del Teatro ----------------]");
        System.out.println("");
        for (int i = 0; i < 10; i++) {
               if ((i>=0) && (i<9)) {
                  System.out.print("Fila 0"+(i+1)+": ");  
               }
               else System.out.print("Fila "+(i+1)+": ");

               for (int j = 0; j < 10; j++) {  
                   System.out.print("["+Teatro[i][j]+"] ");   
               }
               System.out.println("");
            }
            System.out.println("");    
       }
}
