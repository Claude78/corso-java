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
public class Pari {

    public static void main(String[] args) {
        //start
        Scanner s = new Scanner(System.in);
        System.out.println("Inserisci il primo numero: ");
        int n = s.nextInt();
        //int n è una variabile numero intero

        //float risultato = n / 2f;
        //n/2 è un operatore di divisione
        //stampo il risultato:
        //System.out.println(String.format("il risultato contiene: %s" , risultato)); più adatto in java
        // oppureSystem.out.printIn("il valore dimezzato é: " + risultato ); più adatto in jscript
        
        
        int resto = n % 2;
        //operatore % mi restituisce il resto

        if (resto == 0) {
            System.out.println("il numero è pari");

        } else {
            System.out.println("il numero è dispari");

        }

    }

}
