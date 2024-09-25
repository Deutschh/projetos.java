/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;
import java.util.Scanner;
/**
 *
 * @author FATEC ZONA LESTE
 */
public class NewClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o seu nome:");
        String nome = sc.nextLine();
        System.out.println("digite sua turma:");
        String turma = sc.nextLine();
        System.out.println("digite as notas de acorodo com o bimestre.");
        System.out.println("1 bimestre:");
        double b1 = sc.nextDouble();
        System.out.println("2 bimestre:");
        double b2 = sc.nextDouble();
        System.out.println("3 bimestre:");
        double b3 = sc.nextDouble();
        System.out.println("4 bimestre:");
        double b4 = sc.nextDouble();
        double media=(b1+b2+b3+b4)/4;
        
        if(media>7){
            System.out.println("Seu nome é: " + nome);
            System.out.println("Sua turma é: " +turma);
            System.out.println("Sua média é: " +media);
            System.out.println("Você foi aprovado");
        }
        else if(media<7){
            System.out.println("Seu nome é: " + nome);
            System.out.println("Sua turma é " +turma);
            System.out.println("Sua média é: " +media);
            System.out.println("Você foi reprovado");
        }
    }
    
}
