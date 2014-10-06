/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication6;

/**
 *
 * @author Vale
 */
public class NewClass {
 private String email;

    public NewClass(String pnewClass) {
        this.email = pnewClass;
    }
    public String ValidarCorreo(){
    
    String mensaje= "El correo no contiene @";
        for (int i = 0; i < email.length(); i++) {
            if(email.charAt(i)=='@'){
            mensaje="El correo si contiene @";
            }
            
        }
        return mensaje;
    }
    
          
}
