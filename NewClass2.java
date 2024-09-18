/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class NewClass2 {
      public static void main(String[] args) {
        int inicio = 2000;
        int fim = 2250;
        int contador = 0;
 
        for (int i = inicio; i <= fim; i++) {
            contador++;  
        }
  
        System.out.println("A quantidade de números entre " + inicio + " e " + fim + " é: " + contador);
    }  
}
