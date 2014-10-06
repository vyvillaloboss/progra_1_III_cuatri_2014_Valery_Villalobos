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
    int Y2,X2;
    double N2,M2;

    public Ejer2(int Y2, int X2, double N2, double M2) {
        this.Y2 = Y2;
        this.X2 = X2;
        this.N2 = N2;
        this.M2 = M2;
    }

 
    public int sumaYX(){
        int s;
        s=Y2+X2;
        return s;
    
    }
     public int restaYX(){
        int R;
        R=Y2-X2;
        return R;
    }
 public int multiplicacionYX(){
        int M;
        M=Y2*X2;
        return M;
    }
  public int divicionYX(){
        int D;
        D=Y2/X2;
        return D;
    }
   public double sumaNM(){
        double s;
        s=N2+M2;
        return s;
    }
    public double restaNM(){
        double R;
        R=N2-M2;
        return R;
    }
       public double multiplicacionNM(){
        double M;
        M=N2-M2;
        return M;
    }
          public double divicionNM(){
        double D;
        D=N2/M2;
        return D;
    }
}
