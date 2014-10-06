/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase5;

/**
 *
 * @author Vale
 */
public class Operaciones {

    public double Sum(double valor1, double valor2) {
        return valor1 + valor2;
    }

    public double Res(double valor1, double valor2) {
        return valor1 - valor2;
    }

    public double divi(double valor1, double valor2) {
        if (valor2 == 0) {
            return 0;
        } else {
            return valor1 / valor2;
        }

    }

    public double Multi(double valor1, double valor2) {
        return valor1 * valor2;
    }

    public double Raiz(double valor1) {
        return Math.sqrt(valor1);
    }

    public double Poten(double valor1, double valor2) {
        return Math.pow(valor2, valor2);
    }

}
