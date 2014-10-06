/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase6;

import java.util.Scanner;

/**
 *
 * @author Vale
 */
public class Clase6 {

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
                    Ejerc1 oEjerc1 = new Ejerc1(oScanner.nextLine());
                    System.out.println(oEjerc1.ValidarCorreo());
                    break;
            }
        } while (opt <= 7);
    }
    }
    

