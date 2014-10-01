/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica1;

import java.util.Scanner;

/**
 *
 * @author Vale
 */
public class Practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int N = 0;
        double A = 0;
        char C;

        //instancia
        Ejer1 oEjer1 = new Ejer1();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite el valor de N");
        teclado = new Scanner(System.in);
        N = teclado.nextInt();
        System.out.println("Digite el valor de A");
        teclado = new Scanner(System.in);
        A = teclado.nextDouble();
        System.out.println("Digite el valor de C");
        teclado = new Scanner(System.in);
        C = teclado.nextLine().charAt(0);
        System.out.println("N " + N + " A " + A  + " C " + C);
        System.out.println("La Sumatoria es" + oEjer1.Sumatoria(N, A));
        System.out.println("La diferencia es" + oEjer1.Diferencia(N, A));
        
        //Ejerc2

    }
}
