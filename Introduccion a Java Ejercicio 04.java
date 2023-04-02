/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg04;

import java.util.Scanner;

/**
 *
 * @author kiepsun
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit. 
           La fórmula correspondiente es: F = 32 + (9 * C / 5).*/
        Scanner leer=new Scanner (System.in);
        float centi, faren;
        System.out.println("Ingrese la temperatura en grados Centigrados.");
        centi=leer.nextFloat();
        faren=32+(9*centi/5);
        System.out.println("El equivalente de " +centi+ " grados centigrados es " +faren+ " grados Fahrenheit.");
    }
    
}
