/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aisd.zachlanne;

import java.util.Scanner;

/**
 *
 * @author Dawid
 */
public class ResztaZachlanny {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner wejscie = new Scanner(System.in);
        String tekst;
        final int[] M = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        int zl, gr, r, i = 0;
        System.out.println("Podaj reszte..");
        System.out.print("zlotych: ");
        tekst = wejscie.next();
        zl = Integer.parseInt(tekst);
        System.out.print("groszy: ");
        tekst = wejscie.next();
        gr = Integer.parseInt(tekst);
        System.out.print("Reszta: ");
        r = zl * 100 + gr;
        while (r > 0) {
            if (r >= M[i]) {
                System.out.print(M[i] / 100.0 + " ");
                r = r - M[i];
            } else {
                i++;
            }
        }
        System.out.println();
    }
}
