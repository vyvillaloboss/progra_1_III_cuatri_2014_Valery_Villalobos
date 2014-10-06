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
        System.out.println("N " + N + " A " + A + " C " + C);
        System.out.println("La Sumatoria es" + oEjer1.Sumatoria(N, A));
        System.out.println("La diferencia es" + oEjer1.Diferencia(N, A));

        //Ejerc2
        int Y2, X2;
        double N2, M2;
        System.out.println("Digite el valor de X");
        X2 = Integer.parseInt(teclado.nextLine());
        System.out.println("Digite el valor de Y");
        Y2 = Integer.parseInt(teclado.nextLine());
        System.out.println("Digite el valor de M");
        M2 = Double.parseDouble(teclado.nextLine());
        System.out.println("Digite el valor de N");
        N2 = Double.parseDouble(teclado.nextLine());
        //instancia
        Ejer2 oEjer2 = new Ejer2(Y2, X2, N2, M2);
        //resultado de XY
        System.out.println("La suma  de Y+X es" + oEjer2.sumaYX());
        System.out.println("La resta  de Y-X es" + oEjer2.restaYX());
        System.out.println("La division de Y*X es" + oEjer2.multiplicacionYX());
        System.out.println("La multiplicacion de Y/X es" + oEjer2.divicionYX());
        //resultados de MN
        System.out.println("La suma de N+M es" + oEjer2.sumaNM());
        System.out.println("La resta  de N-M es" + oEjer2.restaNM());
        System.out.println("La division  N*M es" + oEjer2.multiplicacionNM());
        System.out.println("La multiplicacion  de N/M es" + oEjer2.divicionNM());

        //Ejer3
        double N3;
        System.out.println("Digite el valor de X");
        N3 = Double.parseDouble(teclado.nextLine());
        //instancia
        Ejerc3 oEjerc3 = new Ejerc3(N);
        System.out.println("El resultado es" + oEjerc3.sumaIncremento());
        //Ejer4
        int A4, B4, C4, D4;
        System.out.println("Digite el valor de A");
        A4 = Integer.parseInt(teclado.nextLine());
        System.out.println("Digite el valor de B");
        B4 = Integer.parseInt(teclado.nextLine());
        System.out.println("Digite el valor de C");
        C4 = Integer.parseInt(teclado.nextLine());
        System.out.println("Digite el valor de D");
        D4 = Integer.parseInt(teclado.nextLine());
        //instancia
        Ejer4 oEjer4 = new Ejer4(A4, B4, C4, D4);
        System.out.println("Los nuevos valores son" + " A es: " + oEjer4.valorA4() + " B es: " + oEjer4.valorB4()
                + " C es: " + oEjer4.valorC4() + " D es: " + oEjer4.valorD4());
//ejer5
        double a;
        boolean esPar;
        System.out.println("Digite el valor de A");
        a = Integer.parseInt(teclado.nextLine());
        //instancia
        Ejer5 oEjer5 = new Ejer5(a);
        esPar = oEjer5.espar();
        if (esPar == true) {
            System.out.println("Es par");
        } else {
            System.out.println("Es impar");
        }
        //ejer6
        double b;
        boolean positivo;
        System.out.println("Digite el valor de B");
        b = Integer.parseInt(teclado.nextLine());
        //instancia
        Ejer6 oEjer6 = new Ejer6(b);
        positivo = oEjer6.Positivo();
        if (positivo == true) {
            System.out.println("Es positivo");
        } else {
            System.out.println("Es negativo");
        }
        //ejer7
        int C;
        System.out.println("Digite el valor de C");
        C = Integer.parseInt(teclado.nextLine());
        //instancia
        Ejer7 oEjer7 = new Ejer7(C);
        System.out.println("  El valor digitado es  " + oEjer7.parimpar() + "  es   " + oEjer7.positivoonegativo()
                + "       " + oEjer7.multiplo() + "  y   " + oEjer7.mayormenor());

    }

}
