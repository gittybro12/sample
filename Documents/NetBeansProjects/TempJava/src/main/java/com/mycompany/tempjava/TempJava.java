/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tempjava;

/**
 *
 * @author dell
 */
public class TempJava {

    public static void main(String[] args) {
        System.out.println("Give in the celsius value");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        double celsius = sc.nextDouble();
        double fahrenheit = 9.0/5.0 * celsius + 32.0;
        System.out.println("fahrenheit :"  +fahrenheit);
        
    }
}
