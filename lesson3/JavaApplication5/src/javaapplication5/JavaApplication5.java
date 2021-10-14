/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication5;

import java.util.Scanner;

/**
 *
 * @author vuduynhien
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        Scanner myInput = new Scanner(System.in);
        n = myInput.nextInt();
//        System.out.println("n: " + n);
        isPrime(n);
    }
    public static void isPrime(int n) {
        bool test = false;
    }
        if (n <= 2) {
            System.out.println("this is not a prime number");
        } else {
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    System.out.println("this is not a prime number because it can divide for the element of it");
            } else {
                    System.out.println("it is a prime nuberm");
                }
        }
    }
    
}
