/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lez04;

import java.util.Scanner;

/**
 *
 * @author tss
 */
public class Scambio {

    public static void main(String[] args) {
        //start
        
        Scanner s = new Scanner(System.in);
        System.out.println("Inserisci il primo numero: ");
        int n1 = s.nextInt();

        System.out.println("Inserisci il secondo numero: ");
        int n2 = s.nextInt();
        
        int z = n1;
        
        n1 = n2;
        
        n2 = z;
        
       System.out.println("il valore di n1 è: " +n1);
       System.out.println("il valore di n1 è:" +n2);
       //System.out.println(String.format("N1 vale %s, N2 vale %s", n1,n2));
        
    }

}
