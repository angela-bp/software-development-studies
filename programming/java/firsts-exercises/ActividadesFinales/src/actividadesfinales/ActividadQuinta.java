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
public class ActividadQuinta {

 //Dado el siguiente polinomio de segundo grado: 𝑦=𝑎𝑥2+𝑏𝑥+𝑐 crea un programa que pida los coeficientes a, b y c, así como el valor de x, y calcule el valor correspondiente de y.
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.print("Introduce a: ");
		double a =sc.nextDouble();
		System.out.print("Introduce b: ");
		double b = sc.nextDouble();
		System.out.print("Introduce c: ");
		double c =sc.nextDouble();
		System.out.print("Introduce x: ");
		double x =sc.nextDouble();
		
		double y = (a*x*x) + (b*x) + c;
		
		System.out.println("El valor de y es: " + y);
		sc.close();
    }
    
}
