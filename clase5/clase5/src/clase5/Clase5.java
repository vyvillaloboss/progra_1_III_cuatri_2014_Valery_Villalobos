/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase5;

import java.util.Scanner;

/**
 *
 * @author Vale
 */
public class Clase5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        boolean validar = true;
        int opt = 0, valor1, valor2;
        double resultado;
        char continuar;
        //instancia

        Scanner teclado = new Scanner(System.in);
        Operaciones oOperaciones = new Operaciones();

        do {
            System.out.println("Digite operacion a eveluar");
            System.out.println("1- Suma");
            System.out.println("2- Resta");
            System.out.println("3- Divicion");
            System.out.println("4- Multiplicacion");
            System.out.println("5- Raiz");
            System.out.println("6- Potencia");
            opt = Integer.parseInt(teclado.nextLine());

            switch (opt) {
                case 1:
                    System.out.println("Digite el valor del primer digito");
                    teclado = new Scanner(System.in);
                    valor1 = Integer.parseInt(teclado.nextLine());
                    System.out.println("Digite el valor del segundo digito");
                    teclado = new Scanner(System.in);
                    valor2 = Integer.parseInt(teclado.nextLine());
                    resultado = oOperaciones.Sum(valor1, valor2);
                    System.out.println(resultado);

                    break;

                case 2:
                    System.out.println("Digite el valor del primer digito");
                    teclado = new Scanner(System.in);
                    valor1 = Integer.parseInt(teclado.nextLine());
                    System.out.println("Digite el valor del segundo digito");
                    teclado = new Scanner(System.in);
                    valor2 = Integer.parseInt(teclado.nextLine());
                    resultado = oOperaciones.Sum(valor1, valor2);
                    System.out.println(resultado);
                    break;

                case 3:
                    System.out.println("Digite el valor del primer digito");
                    teclado = new Scanner(System.in);
                    valor1 = Integer.parseInt(teclado.nextLine());
                    System.out.println("Digite el valor del segundo digito");
                    teclado = new Scanner(System.in);
                    valor2 = Integer.parseInt(teclado.nextLine());
                    resultado = oOperaciones.Sum(valor1, valor2);
                    System.out.println(resultado);
                    break;

                case 4:
                    System.out.println("Digite el valor del primer digito");
                    teclado = new Scanner(System.in);
                    valor1 = Integer.parseInt(teclado.nextLine());
                    System.out.println("Digite el valor del segundo digito");
                    teclado = new Scanner(System.in);
                    valor2 = Integer.parseInt(teclado.nextLine());
                    resultado = oOperaciones.Sum(valor1, valor2);
                    System.out.println(resultado);

                    break;
                case 5:
                    System.out.println("Digite el valor del primer digito");
                    teclado = new Scanner(System.in);
                    valor1 = Integer.parseInt(teclado.nextLine());
                    resultado = oOperaciones.Raiz(valor1);
                    System.out.println(resultado);

                    break;
                case 6:
                    System.out.println("Digite el valor del primer digito");
                    teclado = new Scanner(System.in);
                    valor1 = Integer.parseInt(teclado.nextLine());
                    System.out.println("Digite el valor del segundo digito");
                    teclado = new Scanner(System.in);
                    valor2 = Integer.parseInt(teclado.nextLine());
                    resultado = oOperaciones.Poten(valor1, valor2);
                    System.out.println(resultado);
                    break;

                default:
                    break;
            }
            System.out.println("Desea continuar con otra operación S/N");
            continuar = teclado.nextLine().charAt(0);
            if ((continuar == 'S') || (continuar == 's')) {
                validar = true;
            } else {
                validar = false;
            }

        } while (validar);

    }

}
