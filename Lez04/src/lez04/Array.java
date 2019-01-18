/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lez04;

import java.util.Locale;

/**
 *
 * @author tss
 */
public class Array {

    public static void main(String[] args) {
        //dichiarazione array interi. In Java devo specificare il n preciso.Scrivere numeri non va bene
        int[] numeri;

        //creazione di un array di 100 numeri. Viene creata struttura adatta a contenere 100 numeri
        numeri = new int[100];
        //forma abbreviata 1 di (int [] numeri; e numeri = new int [100];
        int[] numeri1 = new int[100];
        // qui c'è un array di 100 volte di 0 perchè int [] dentro le quadre non definisce il n
        // forma abbreviata 2
        int[] numeri2 = {10, 20, 30, 40};

        stampa(numeri2);

        System.out.println("--------------------------------------------------");

        stampa(numeri1);
        
        System.out.println("--------------------------------------------------");

        stampa(numeri);

//stampa
        //for (int i = 0; i < 100; i++) {
        //ora mi vado a prendere l'elemento
        //int elemento = numeri[i];
        //System.out.println(String.format("numeri[%s] = %s", i, elemento));
        //}
        //carica i valori
        int valore = 1;
        for (int i = 0; i < numeri.length; i++) {
            //ora mi vado a prendere l'elemento
            numeri[i] = valore;
            valore = valore + 1;

        }

        System.out.println("--------------------------------------------------");

        stampa(numeri);
        //stampa
        //for (int i = 0; i < 100; i++) {
        //ora mi vado a prendere l'elemento
        //   int elemento = numeri[i];
        //  System.out.println(String.format("numeri[%s]=%s", i, elemento));
        //}

    }

    // function in java
    public static void stampa(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int el = array[i];
            System.out.println(String.format("array[%s] = %s", i, el));

        }

    }

}
