/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aisd.dzielZwyciezaj;

import java.util.Random;

/**
 *
 * @author Dawid
 */
public class LosowanieLiczby {

    public static int step = 0;

    public static void main(String[] args) {
        Random r1 = new Random();
        int number = r1.nextInt(1001);
        findNumber(0, 1000, number);
    }

    public static void findNumber(int from, int to, int number) {
        step++;
        int polowa = from + (to - from) / 2;
        if (polowa == number) {
            System.out.println("Liczba " + number + " znaleziona po " + step + " krokach.\n");
        } else {
            if (number < polowa) {
                System.out.println(polowa + " Za mała");
                findNumber(from, polowa, number);
            }
            if (polowa < number) {
                System.out.println(polowa + " Za duża");
                findNumber(polowa, to, number);
            }
        }
    }
}
