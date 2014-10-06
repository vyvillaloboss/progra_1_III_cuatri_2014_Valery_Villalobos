/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica1;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Ejer5 {
    double a;

    public Ejer5(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }
    
     public boolean espar() {
        boolean esPar;
        if (this.a % 2 == 0) {
           esPar= true;

        } else {
            esPar = false;
        }
        return (esPar);
    }

}
