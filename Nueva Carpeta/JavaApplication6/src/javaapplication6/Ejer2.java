/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication6;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Ejer2 {private String cadena;

    public String getCadena() {
        return cadena;
    }

    public String MediaCadena() {
        String retorno = "";
        for (int i = 0; i < getCadena().length() / 2; i++) {
            retorno  += getCadena().charAt(i);

        }
        return retorno;
    }

    public String UltimoValor() {
        return getCadena().charAt(getCadena().length() - 1) + "";
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }
    public String Alrevez(){
    String retorno= "";
    for(int i = getCadena().length()-1; i >= 0; i--) {
         retorno += getCadena().charAt (i);
         
        
                }return retorno;
        
    }
        public String Guion(){
             String retorno= "";
             for (int i = 0; i <getCadena().length() ; i++) {
                 if(getCadena().length()-1==i){
                     retorno+=getCadena().charAt(i);
                     
                 }
                 else{
                        retorno+=getCadena().charAt(i)+"-";
                     
                 }
            }
        return retorno;
        }
        public int vocales (){
            int cantidadValores=0;
            for (int i = 0; i < getCadena().length(); i++) {
                if( (getCadena() .charAt(i)=='a') ||
                        (getCadena().charAt(i)=='A') ||
                          (getCadena().charAt(i)=='e') ||
                          (getCadena().charAt(i)=='E') ||
                          (getCadena().charAt(i)=='i') ||
                          (getCadena().charAt(i)=='I') ||
                          (getCadena().charAt(i)=='o') ||
                          (getCadena().charAt(i)=='O') ||
                          (getCadena().charAt(i)=='u') ||
                          (getCadena().charAt(i)=='U')){
                cantidadValores++;
                }
            }         
             return cantidadValores;     
                
        }
        public boolean Palindromo()
        {
        String palAlrevez="";
            for (int i = getCadena().length()-1; i >=0 ; i++) {
                
              palAlrevez+=getCadena().charAt(i);
            }
            if(getCadena().equals(palAlrevez)){
            return true;
            }
            else{
            return false;
            }
        }
            
           
            
            
            }
    





