/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezs05;

/**
 *
 * @author tss
 */
public class Lezs05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] numeri = {3, 13, 23, 73, 06, 10, 11, 8, 9, 7};
        stampa(numeri);

        int numeroMax = max(numeri);
        System.out.println(numeroMax);

        boolean cercaNum = cerca(numeri, 54);
        System.out.println(cercaNum);

    }

    public static void stampa(int[] array) {
        //foreach
        for (int numero : array) {
            System.out.println(numero);
        }
    }

    //trovare il massimo in un array di numeri
    public static int max(int[] array) {
        int risultato = array[0];
        for (int el : array) {
            if (el > risultato) {
                risultato = el;
            }
        }
        return risultato;
    }

    //ricerca di un numero
    public static boolean cerca(int[] array, int numero) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numero) {
                return true;
            }
        }
        return false;

    }

}

//estrarre i numeri pari
public static int[] pari(int[] array) {

    }

    //ordinare un array di numeri
    public static void ordina(int[] array) {
    }
}
