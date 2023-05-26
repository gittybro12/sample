/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author dell
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Enter your instruction:");
        String text = input.nextLine();
        switch (text) {
            case "run":
                System.out.println("program is running");
                break;
            case "stop":
                System.out.println("program has stopped");
                break;
            default:
                System.out.println("instuction not found");
                

        }

    }
}
