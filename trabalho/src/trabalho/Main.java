/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabalho;

import java.util.Scanner;

/**
 *
 * @author FATEC ZONA LESTE
 * 
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Digite o primeiro número: ");
        double n1 = scanner.nextDouble();
        System.out.println("digite o sgundo número:");
        double n2 = scanner.nextDouble();
        if (n1 > 0 && n1 < 88 && n2 > 0 && n2 < 88) {
            System.out.println("valores corretos");
        }else{
            System.out.println("valores incorretos");
                
        }
    }
    
}
