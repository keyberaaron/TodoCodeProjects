
package todocode6;

import java.util.Scanner;

public class TodoCode6 {
    
    public static void main(String[] args) {
        
        int vuelo [][] = new int [6][3];
        Scanner leer = new Scanner(System.in);
        int res=0;
        
        String ciudad [] = new String[6];
        ciudad[0]= "Rio de Janeiro";
        ciudad[1]= "Madrid        ";
        ciudad[2]= "Paris         ";
        ciudad[3]= "Santiago Chile";
        ciudad[4]= "Milan         ";
        ciudad[5]= "Ciudad Mexico ";
        
        String turno[] = new String[3];
        turno[0]= "Mañana";
        turno[1]= "Tarde";
        turno[2]= "Noche";
        
        int pais, turn, cantidad = 0;
        String seguir;
        
        System.out.println("Ingresar Asientos Disponibles por Vuelo por Turno:"); 
        for (int i = 0; i < 6; i++) {
            System.out.println(ciudad[i]+": ");
            for (int j = 0; j < 3; j++) {
                System.out.print(turno[j]+": ");
                vuelo[i][j]= leer.nextInt();
            }System.out.println("");
        }
                   
        
        while (res!=3) {
            System.out.println("****************************************");
            System.out.println("****** PROGRAMA DE VUELOS AVIANCA ******");
            System.out.println("****************************************");
            System.out.println("* [1] Ver Disponibilidad               *");
            System.out.println("* [2] Reserva para Clientes            *");
            System.out.println("* [3] Salir                            *");
            System.out.println("****************************************");
            System.out.println("");
            res = leer.nextInt();
            
            switch (res) {
        
                case 1:    
                    
                    System.out.println("|***********************************|");
                    System.out.println("|***** Disponibilidad Asientos *****|");
                    System.out.println("|***********************************|");
                    System.out.println("|     Ciudad      |Mañ  |Tar  |Noc  |");
                    System.out.println("|***********************************|");
                    for (int i = 0; i < 6; i++) {
                        System.out.print("| "+ciudad[i]);
                        for (int j = 0; j < 3; j++) {
                            if (j<2) {
                               System.out.print("  |"+vuelo[i][j]);
                            }
                            if (j==2) {
                               System.out.print("  |"+vuelo[i][j]+"  |");
                            }
                        }System.out.println("");
                    }
                    System.out.println("|***********************************|");                    
//timer para esperar, funciona bien
//                    try
//                    {
//                        Thread.sleep(5*1000);
//                    }
//                    catch(Exception e)
//                    {System.out.println(e);}
//pulsa enter para continuar
                    System.out.println("Pulse Enter para continuar...");
                    leer.nextLine(); //Limpiamos buffer del System.in
    		    leer.nextLine(); //Ahora el programa se detiene hasta qu
                    break;
                    
                case 2: 
                    
                    System.out.println("*** Seleccione Pais: ***");
                    for (int i = 0; i < 6; i++) {
                        System.out.println("("+i+") "+ciudad[i]);
                    } 
                    System.out.print("Opcion: "); 
                    pais = leer.nextInt();
                    
                    if (pais >=0 && pais<=5) {
                        System.out.println("*** Seleccione Turno: ***");
                        for (int i = 0; i < 3; i++) {
                            System.out.println("("+i+") "+turno[i]);
                        } 
                        System.out.print("Opcion: ");
                        turn = leer.nextInt();
                        
                        if (turn >=0 && turn<=2) {

                            System.out.println("*** Seleccione Cantidad de Boletos: ***");
                            cantidad = leer.nextInt();

                            for (int i = 0; i < 6; i++) {
                                for (int j = 0; j < 3; j++) {
                                   if ((pais == i) && (turn==j)) {
                                      if (vuelo[i][j]>=cantidad) {
                                         vuelo[i][j]= vuelo[i][j] - cantidad;
                                          System.out.println("La reserva fue exitosa!");
                                      } 
                                      else System.out.println("No hay la Disponibilidad Requerida. Intente nuevamente!");
                                   } 
                                }System.out.println("");
                            }
                        }
                        else {
                            System.out.println("Error, debe seleccionar una opcion numerica entre 0 y 2");
                            System.out.println("Pulse Enter para continuar...");
                            leer.nextLine(); 
                            leer.nextLine();  
                        }  
                    }
                    else {
                        System.out.println("Error, debe seleccionar una opcion numerica entre 0 y 5");
                        System.out.println("Pulse Enter para continuar...");
                        leer.nextLine(); 
                        leer.nextLine();            
                    }      
                    break;
                
                case 3: System.out.println("Finish");    
                        System.out.println("Programa Culminado!");
                        break;
                        
               default: System.out.println("Error, debe seleccionar una opcion numerica entre 1 y 4");
                        System.out.println("Pulse Enter para continuar...");
                        leer.nextLine(); 
                        leer.nextLine(); 
               
            }       
        }      
    } 
}
