/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package salidaporconsola;

import java.util.Scanner;

public class SalidaPorConsola {

    public static void main(String[] args) {
        System.out.print ("Hola ");
        System.out.print ("clase");
        System.out.println ("!");
        System.out.println ("Empezamos Java");
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Introduce tu edad: ");
        int edad = sc.nextInt();
        
        sc.nextLine();
        
        System.out.print("Introduce un nombre completo: ");
        String nombre =sc.next();
        
        System.out.println("Hola, " + nombre);
        System.out.println("Tienes " + edad + " anios");
        
    }
}



