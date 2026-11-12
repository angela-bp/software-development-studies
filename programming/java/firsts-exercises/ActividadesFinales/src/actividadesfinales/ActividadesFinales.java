/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividadesfinales;

import java.util.Scanner;

//Actividad Primera:  Realizar cálculos con el IVA. La aplicación debe solicitar la base imponible y el IVA que se debe aplicar. Muestra en pantalla el importe correspondiente al IVA y al total.
public class ActividadesFinales {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("La base imponible es ");
	double base = sc.nextDouble ();
		
	System.out.print("El IVA que se debe aplicar es: ");
        double precioIva = sc.nextDouble();
		
	double iva = base * precioIva / 100;
        double total = base - iva;
		
	System.out.println("El IVA es " + iva);
	System.out.println("El total es " + total);
	sc.close();
        
        
    }
    
}
