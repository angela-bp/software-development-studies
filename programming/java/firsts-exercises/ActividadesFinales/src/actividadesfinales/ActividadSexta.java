/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividadesfinales;

import java.util.Scanner;

/**
 *
 * @author Angela
 */
public class ActividadSexta {

   //Diseña una aplicación que solicite al usuario que introduzca una cantidad de segundos. La aplicación debe mostrar cuántas horas, minutos y segundos hay en el número de segundos introducidos por el usuario.
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.print("Introduce los segundos: ");
		int segundos=sc.nextInt();
		
		int horas = segundos / 3600;
                int minutos = (segundos % 3600) / 60;
                int segundosRestantes = segundos % 60;
		
		System.out.println("El resultado es: " + horas + " horas " + minutos + " minutos " + segundosRestantes + " segundos." );
		sc.close();
    }
    
}
