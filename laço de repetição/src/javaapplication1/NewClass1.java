/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author FATEC ZONA LESTE
 */import java.util.Scanner;
public class NewClass1 {
     public static void main(String[] args) {
         try (Scanner Scanner = new Scanner(System.in)) {
             System.out.print("Informe um número para ver sua tabuada: ");
             int numero = Scanner.nextInt();
             
             
             System.out.println("Tabuada do " + numero + ":");
             for (int i = 1; i <= 10; i++) {
                 System.out.println(numero + " x " + i + " = " + (numero * i));
             }}
    }
}
