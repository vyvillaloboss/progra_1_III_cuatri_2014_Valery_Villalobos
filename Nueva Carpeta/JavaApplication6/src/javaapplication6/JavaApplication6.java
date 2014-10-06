/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication6;

import java.util.Scanner;

/**
 *
 * @author Vale
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int opt = 0;
        Scanner oScanner = new Scanner(System.in);
        do {
            System.out.println("Digite la opcion que desea");
            System.out.println("1- Ejercicio 1");
            System.out.println("2- Ejercicio 2");
            opt = oScanner.nextInt();
            switch (opt) {
                case 1:
                    System.out.println("Digite el correo a evaluar");
                    oScanner = new Scanner(System.in);
                     NewClass oNewClass= new NewClass(oScanner.nextLine());
                    System.out.println(oNewClass.ValidarCorreo());
                    break;
                case 2:
                    System.out.println("Digite la cadena  a evaluar");
                    Ejer2  oEjerc2= new Ejer2();
                    oScanner = new Scanner(System.in);
                    oEjerc2.setCadena(oScanner.nextLine());
                     System.out.println(oEjerc2.MediaCadena());
                    System.out.println(oEjerc2.UltimoValor());
                    System.out.println(oEjerc2.Alrevez());
                    System.out.println(oEjerc2.Guion());
                    System.out.println(oEjerc2.vocales());
                    System.out.println(oEjerc2.Palindromo());
            }
        } while (opt <= 7);
    } }
    

