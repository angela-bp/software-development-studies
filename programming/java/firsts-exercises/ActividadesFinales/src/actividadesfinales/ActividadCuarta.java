/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividadesfinales;

import java.util.Scanner;

public class ActividadCuarta {
//Crea un programa que pida la base y la altura de un triángulo y muestre su área: Area del triangulo = Base x Altura /2
   
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("Introduce la base del triangulo: ");
        int base = sc.nextInt();
        System.out.print("Introduce la altura del triangulo: ");
        int altura = sc.nextInt();
        
        int area = (base * altura) / 2;
        System.out.println("El area del triangulo es: " + area);
        sc.close ();
        
    }
    
}
