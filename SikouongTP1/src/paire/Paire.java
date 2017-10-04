/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paire;

import java.util.Scanner;

/**
 *
 * @author naomi
 */
public class Paire {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // declaration des variables
        int n;
        //ENTRER ET LIRE N
    System.out.println("entrer un nombre entier n: ");
     Scanner sc=new Scanner(System.in);
     n=sc.nextInt();
      //testons si n est paire ou pas
     if(n%2==0) {
        System.out.println("nombre paire");
                }
    else {
        System.out.println("nombre impaire");
         }
       
    }
    /*var N:number;
   System.Out.Println("nombre pair");
    if(Nmod2==0) {
        alert("nombre paire");
                }
    else {
        alert("nombre impaire");
         }*/
}
