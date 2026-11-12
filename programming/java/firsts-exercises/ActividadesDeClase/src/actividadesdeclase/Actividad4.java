/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividadesdeclase;

import java.util.Scanner;

/**
 *
 * @author Angela
 */
public class Actividad4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print ("Está lloviendo? (true/false): ");
         boolean llueve =sc.nextBoolean();
         System.out.print("Has terminado las tareas? (true/false): ");
         boolean tareas = sc.nextBoolean();
         System.out.print("Tienes que ir a la biblioteca? (true/false): ");
         boolean biblioteca = sc.nextBoolean();
         
         boolean salir = (!llueve && tareas) || biblioteca;
         
         System.out.println("Puede salir?: " + salir);
         sc.close();
    }
    
}
