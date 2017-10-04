/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoriel;

import java.util.Scanner;

/**
 *
 * @author naomi
 */
public class Factoriel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

    int n,i,fact;
    // ENTRER ET LIRE N
    System.out.println("entrer un nombre n");
     Scanner sc=new Scanner(System.in);
     n=sc.nextInt();
    //CALCUL DU FACTORIEL debut
    fact=1;
    if(n>1)
    {
     for(i=1;i<=n;i=i+1)
     {
      fact=fact*i;
     }
    }
    //CALCUL DU FACTORIEL fin
    
    //Affichage
    System.out.println("le factoriel du nombre entré "+n+" est:"+fact);
    
}
    
}
