/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multiplicacionxsuma;

import java.util.Scanner;
public class MultiplicacionxSuma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner objread=new Scanner(System.in);
      int num1,num2,resultado=0;
      //lectura de dos numeros
        System.out.print("Digite un numero positivo ");
        num1=objread.nextInt();
        System.out.print("Digite otro numero entero positivo ");
        num2=objread.nextInt();
        //multiplicacio atraves de sumas
        for (int i = 1; i <= num2; i++) {
            resultado+=num1;    
     }//fin para
        System.out.println("\n La multiplicacion da " + resultado);
    }
    
}
