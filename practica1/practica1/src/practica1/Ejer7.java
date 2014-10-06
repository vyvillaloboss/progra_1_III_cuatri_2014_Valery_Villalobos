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
public class Ejer7 {
   
 int C;
 //metodo constructor
 public Ejer7 (int B){
 this.C=B;
 }
 //si es positivo o negativo
 public String positivoonegativo (){
 String pos="Positivo";
 String neg="Negativo";
 if(this.C>=0){
     return pos;}
 else
 {return neg;}
 }
 // si es par o impar
 public String parimpar() {
 String p="Par";
 String n="Impar";
 if(this.C%2==0){
     return p;}
 else {
     return n;}
 }
 // si es multiplo
 public String multiplo (){
 String Mul="Multiplo";
 String NMul="No es multiplo";
 if(this.C%5==0&&this.C%10==0){
     return Mul;}
 else
 {return NMul;}
 }
 // si es mayor o menor que cien
 public String mayormenor (){
 String Ma="Es mayor";
 String Me="Es menor";
 if(this.C>100) {
     return Ma;} 
 else{
     return Me;}
 }

}
