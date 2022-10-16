/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package compara2numeros;
import java.util.Scanner; //importamos clase Scanner para entrada de datos por teclado

/**
 * 1.- Realiza un diagrama de flujo que le permita introducir dos
 * números por teclado y mostrarlos en orden de mayor a menor. Y
 * mostrar el texto “SON IGUALES”, en caso de igualdad.
 * @author Piedad
 */
public class Compara2Numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Variables*/
        int a, b;
        Scanner entrada = new Scanner (System.in);
        
        /*Entrada de datos*/
        System.out.println("Introduzca el primer número: ");
        a = entrada.nextInt();
        System.out.println("Introduzca el segundo número: ");
        b = entrada.nextInt();
        System.out.println("");
        
        
        /* Procesamiento */
        if (a==b){
            System.out.println("Son iguales");
        } else if(a>b){
                System.out.println(a + " es mayor que " + b);
                } else{
                    System.out.println(b +" es mayor que "+a);
        }
    }
    
}
