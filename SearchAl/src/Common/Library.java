/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Common;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Library {
        public int getNumber(String x, int a, int b) {
        int c = -1;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print(x + ": ");
            try {
                String s = sc.nextLine();
                c = Integer.parseInt(s);
                if (c >= a && c <= b) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Please enter a number between " + a + " and " + b);
            }
        }
        return c;
    }

    public int[] createArray(int sizeArray) {
        int[] array = new int[sizeArray];
        Random t = new Random();
        for (int i = 0; i < sizeArray; i++) {
            array[i] = t.nextInt(100);
        }
        return array;
    }

    public void display(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i < array.length - 1) {
                System.out.print(array[i] + ", ");
            } else {
                System.out.print(array[i]);
            }
        }
        System.out.println("");
    }

}
