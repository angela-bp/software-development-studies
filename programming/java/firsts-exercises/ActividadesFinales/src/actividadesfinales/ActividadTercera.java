/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividadesfinales;

import java.util.Scanner;

public class ActividadTercera {

    //Modifica la Actividad 2 para que, indicando dos números n y m, diga qué cantidad hay que sumarle a n para que sea múltiplo de m.
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce primer numero: ");
        int numeron = sc.nextInt();
	System.out.print("Introduce segundo numero: ");
        int numerom = sc.nextInt();
		
	int resto = numeron % numerom;
        int cantidad = (numerom - resto) % numerom;

        System.out.println("Hay que sumarle al primer numero " + cantidad + " para que sea multiplo del segundo");

        sc.close();
    }
    
}
