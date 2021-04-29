/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import excepciones.MyException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author ryano
 */
public class Consola {
    //El clásico
    public static void muestraMensaje(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje);
    }      
    //Muestra el menú de opciones
    public static int menuOpcion () {
        String opcionSt = JOptionPane.showInputDialog(
            "1. Opcion 01 \n" +
            "2. Opcion 02 \n" +
            "3. Opcion 03 \n" +
            "4. Opcion 04 \n" +
            "5. Opcion 05 \n" +
            "6. Fin ");
        if (opcionSt == null) {
            return 6;
        }
        int opcion;
        try {
            opcion = Integer.parseInt(opcionSt);
        } catch (NumberFormatException e) {
            Consola.muestraMensaje(opcionSt + " No es una opción válida");
            opcion = 0;
        }
        return opcion;
    }
  
    public static String pideCadena(String mensaje) throws MyException {
        String cadena = JOptionPane.showInputDialog(mensaje);
        if (cadena == null) {
            throw new MyException("has cancelado la introducción de datos");
        } else if (cadena.equals("")) {
            throw new MyException("No has introducido nada");
        }
        return cadena;
    }
    
    public static int pideOpcion(String mensaje) {
        return JOptionPane.showConfirmDialog(null, mensaje);
    }

    
    public static int pideEnteroThrows(String mensaje) throws MyException {
        String enteroSt = pideCadena(mensaje);
        int entero = 0;
        try {
            entero = Integer.parseInt(enteroSt);
        } catch (NumberFormatException e) {
            throw new MyException("Has indroducido un caracteres no numéricos");
        } 
        /*Si el entero tiene que ser positivo:
        if (entero < 1) {
            throw new MyException("Has introducido cero o un negativo");
        }*/
        return entero;
    }
    
    public static int pideEnteroTries(String mensaje){
        String enteroSt = "";
        try {
            enteroSt = pideCadena(mensaje);
        } catch (Exception e) {
            muestraMensaje(e.getMessage());
        }
        int entero = 0;
        try {
            entero = Integer.parseInt(enteroSt);
        } catch (NumberFormatException e) {
            muestraMensaje("Has indroducido un caracteres no numéricos");
        } 
        /*Si el entero tiene que ser positivo:
        if (entero < 1) {
            muestraMensaje("Has introducido cero o un negativo");
        }*/
        return entero;
    }
}
