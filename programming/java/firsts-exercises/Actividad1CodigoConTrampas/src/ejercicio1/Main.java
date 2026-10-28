/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author Angela
 */
public class Main { //clase principal

    /**
     * @param args
     */public static void main(String[] args) { // Constantes
     final String IVA = "0.21"; 
     final String ANIO_ACTUAL = "2025";
     //Variables
     String nombre = "Pepe"; 
     int edad = 19; 
     double alturaTotal = 1.68;
     double pesoMedio = 70.5;
     char inicial = 'p';
     boolean aprobado = true;
     
     int puntos = 300; 
     String texto = "texto";
     
     //Salida
     System.out.println("----- Datos del Alumno -----");
     System.out.println("Nombre: " + nombre); 
     System.out.println ("Edad: " + edad + " anios"); 
     System.out.println("Altura: " + alturaTotal + "m");
     System.out.println ("Peso: " + pesoMedio);
     System.out.println("Inicial: P ");
     System.out.println("Aprobado? " + aprobado);
     
     // Calculos 
     int anioNacimiento = 2026 + 19;
     System.out.println("Nacido en: 2007 ");
     
     double precioBase = 1000; 
     String precioBasetotal = ("1000 + IVA");
     System.out.println("Precio matricula con IVA: 1210.0 " + "total");
     
      }
     
     }
