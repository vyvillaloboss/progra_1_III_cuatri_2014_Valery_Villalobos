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
public class Ejer2 {
    int Y,X;
    double N,M;

    public Ejer2(int Y, int X, double N, double M) {
        this.Y = Y;
        this.X = X;
        this.N = N;
        this.M = M;
    }
    public int sumaYX(){
        int s;
        s=Y+X;
        return s;
    
    }
     public int restaYX(){
        int R;
        R=Y-X;
        return R;
    }
 public int multiplicacionYX(){
        int M;
        M=Y*X;
        return M;
    }
  public int divicionYX(){
        int D;
        D=Y/X;
        return D;
    }
   public double sumaNM(){
        int s;
        s=Y+X;
        return s;
    }
    public double restaNM(){
        int R;
        R=Y-X;
        return R;
    }
       public double multiplicacionNM(){
        int M;
        M=Y-X;
        return M;
    }
          public double divicionNM(){
        int D;
        D=Y/X;
        return D;
    }
}
