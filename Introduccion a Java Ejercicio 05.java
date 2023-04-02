/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg05;

import java.util.Scanner;

/**
 *
 * @author kiepsun
 */
public class EJERCICIO05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble, 
        el triple y la raíz cuadrada de ese número. 
        Nota: investigar la función Math.sqrt().*/
        
        Scanner leer=new Scanner(System.in);
        int num,doble,triple;
        System.out.println("Ingrese un numero entero.");
        num=leer.nextInt();
        doble=num*2;
        triple=num*3;
        System.out.println("El doble de "+num+" es "+doble+". El triple de "+num+" es "+triple+". La raiz cuadrada de "+num+" es "+Math.sqrt(num)+".");
    }
    
}
