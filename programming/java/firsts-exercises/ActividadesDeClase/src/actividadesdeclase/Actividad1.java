/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadesdeclase;

import java.util.Scanner;

/**
 *
 * @author Angela
 */
public class Actividad1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        {
            System.out.print("Introduce el primer numero entero: ");
            int primerNumero = sc.nextInt();
            System.out.print("Introduce el segundo numero entero: ");
            int segundoNumero = sc.nextInt();
            System.out.println("La suma es: " + (primerNumero + segundoNumero));
        }

    }
}
