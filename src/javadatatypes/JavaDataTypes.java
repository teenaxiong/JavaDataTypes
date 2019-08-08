/*
This is a problem on Hackerrank.com, solved by Teena Xiong

Java has 8 primitive data types; char, boolean, byte, short, int, long, float, and double. 
For this exercise, we'll work with the primitives used to hold integer values (byte, short, int, and long):

A byte is an 8-bit signed integer.
A short is a 16-bit signed integer.
An int is a 32-bit signed integer.
A long is a 64-bit signed integer.
Given an input integer, you must determine which primitive data types are capable of properly storing that input.
 */
package javadatatypes;

import java.util.Scanner;

/**
 *
 * @author teena
 */
public class JavaDataTypes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        {
            System.out.println("How many numbers do you want to test?");
            Scanner sc = new Scanner(System.in);
            //this while loop makes sure user is entering a digit
            while (!sc.hasNextInt()) {
                System.out.println("\nThat is not a digit format. Please enter a digit. ");
                sc.next();
            }
            int t = sc.nextInt();

            for (int i = 0; i < t; i++) {
                System.out.println("Enter a number:");

                //while loop makes sure user entered a digit
                while (!sc.hasNextInt()) {
                    System.out.println("\nThat is not a digit format. Please enter a digit.");
                    sc.next();
                }
                try {
                    long x = sc.nextLong();
                    System.out.println(x + " can be fitted in:");
                    if (x >= -128 && x <= 127) {
                        System.out.println("* byte");
                    }
                    if (x >= -32768 && x <= 32767) {
                        System.out.println("* short");
                    }
                    if (x >= Math.pow(-2, 31) && x <= Math.pow(2, 31) - 1) {
                        System.out.println("* int");
                    }
                    if (x >= Math.pow(-2, 63) && x <= Math.pow(2, 63) - 1) {
                        System.out.println("* long");
                    }
                    System.out.println();
                } catch (Exception e) {
                    System.out.println(sc.next() + " can't be fitted anywhere.");
                }

            }
        }
    }
}
