/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadesdeclase;

import java.util.Scanner;

public class Actividad2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        {

            System.out.print("Introduce el nombre del jugador: ");
            String nombreJugador = sc.nextLine();

            System.out.print("Introduce los puntos de la primera partida: ");
            int primeraPartida = sc.nextInt();

            System.out.print("Introduce los puntos de la segunda partida: ");
            int segundaPartida = sc.nextInt();

            System.out.println(nombreJugador + " ha conseguido un total de " + (primeraPartida + segundaPartida));
            sc.close();
        }

    }
}
