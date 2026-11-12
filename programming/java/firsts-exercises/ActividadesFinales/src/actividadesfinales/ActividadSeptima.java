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
public class ActividadSeptima {

    //Solicita al usuario tres distancias: ▪ La primera, medida en milímetros. ▪ La segunda, medida en centímetros. ▪ La última, medida en metros. Diseña un programa que muestre la suma de las tres longitudes introducidas (medida en centímetros).
    
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.print("La primera medida es: ");
    double milimetros=sc.nextDouble();
    System.out.print("La segunda medida es: ");
    double centimetros=sc.nextDouble();
    System.out.print("La tercera medida es: ");
    double metros=sc.nextDouble();
    
    double milimetrosResultado = milimetros / 10;
    double metrosResultado = metros * 100;
    double resultado= centimetros + milimetrosResultado + metrosResultado;
    
    System.out.println("El resultado es: " + resultado + " cm.");
    sc.close();
    
    
    }
    
}
