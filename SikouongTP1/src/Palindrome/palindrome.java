/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Palindrome;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author naomi
 */
public class palindrome {
    
     public static void main(String[] args) {
         //declarations char ch[]
         String ch="";
         int  i1,i2,j1,j2;
       //Entrer un string  
      Scanner sc=new Scanner(System.in);
      System.out.println("ENTRER UNE chaine de caractere:");
      ch=sc.next();
      int n=ch.length();
       if(n%2==0) {
        //Si la chaine a une longueur paire
        i1=0; i2=(n/2)-1;
        j1=n-1; j2=(n/2);
                }
       else {
        //Si la chaine a une longueur impaire
        i1=0; i2=((n-1)/2)-1;
        j1=n-1; j2=((n-1)/2)+1;
         }
       
       int i=i1, j=j1;
       while((i<=i2)&&(j>=j2)&&(ch.charAt(i)==ch.charAt(j)))
       {
           i=i+1;j=j-1;
       }
       
        if((i==i2+1)&&(j==j2-1))
       {
           System.out.println("Oui, la chaine de caractere est un palindrome");
       }
        else
       {
           System.out.println("Non, la chaine de caractere n'est pas un palindrome");
       }
       
           
     }
    
}
