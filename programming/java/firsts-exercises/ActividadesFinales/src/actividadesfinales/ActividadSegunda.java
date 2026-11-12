/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividadesfinales;

import java.util.Scanner;

public class ActividadSegunda {
//Escribe un programa que tome como entrada un número entero e indique qué cantidad hay que sumarle para que el resultado sea múltiplo de 7. 
//Un ejemplo: ▪ A 2 hay que sumarle 5 para que el resultado (2 + 5 = 7) sea múltiplo de 7. ▪ A 13 hay que sumarle 1 para que el resultado (13 + 1 = 14) sea múltiplo de 7. Si proporcionas el número 2 o el 13, la salida de la aplicación debe ser 5 o 1, respectivamente.
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero entero: ");
        int numero = sc.nextInt();

        int resto = numero % 7;
        int cantidad = (7 - resto) % 7;

        System.out.println("Hay que sumarle " + cantidad + " para que su resultado sea multiplo de 7.");

        sc.close();
    }
    
}
