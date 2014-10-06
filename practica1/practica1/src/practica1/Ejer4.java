/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica1;

/**
 *
 * @author Vale
 */
public class Ejer4 {
   int A4, B4, C4 ,D4;

    public Ejer4(int A4, int B4, int C4, int D4) {
        this.A4 = A4;
        this.B4 = B4;
        this.C4 = C4;
        this.D4 = D4;
    }

    public int getA4() {
        return A4;
    }

    public void setA4(int A4) {
        this.A4 = A4;
    }

    public int getB4() {
        return B4;
    }

    public void setB4(int B4) {
        this.B4 = B4;
    }

    public int getC4() {
        return C4;
    }

    public void setC4(int C4) {
        this.C4 = C4;
    }

    public int getD4() {
        return D4;
    }

    public void setD4(int D4) {
        this.D4 = D4;
    }

    

   
    public int valorB4(){
        int B;
    B=getC4();
    return B;
    }
    public int valorC4(){
        int C;
    C=getA4();
    return C;
    }
    public int valorA4(){
        int A;
    A=getD4();
    return A;
    }
    public int valorD4(){
        int D;
    D=getB4();
    return D;
    }
 
}
