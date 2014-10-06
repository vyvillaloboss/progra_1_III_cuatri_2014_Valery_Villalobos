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
public class Ejer6 {
    double b;

    public Ejer6(double b) {
        this.b = b;
    }
     public boolean Positivo() {
        boolean esPositivo;
        if (this.b >=0) {
            esPositivo = true;

        } else {
            esPositivo = false;
        }
        return (esPositivo);
    }

}
