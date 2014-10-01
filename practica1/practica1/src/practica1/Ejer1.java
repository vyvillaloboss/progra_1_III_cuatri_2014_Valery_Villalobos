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
public class Ejer1 {
    
       int N;
      double A;
      char C;

    public Ejer1() {
        this.N=0;
        this.A=0;
        this.C=0;
       
        
    }

    public int getN() {
        return N;
    }

    public void setN(int N) {
        this.N = N;
    }

    public double getA() {
        return A;
    }

    public void setA(double A) {
        this.A = A;
    }

    public char getC() {
        return C;
    }

    public void setC(char C) {
        this.C = C;
    }
    
    public double Sumatoria(int N, double A)
    { 
        double suma;
        suma= (N+A);
        return suma;
        
    }
    public double Diferencia(int N, double A)
    {
    double resta;
    resta=(N-A);
    return resta;
  
    }
    
         
         
         
    
}
