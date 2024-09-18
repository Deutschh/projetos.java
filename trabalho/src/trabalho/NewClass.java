/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho;
import java.util.Scanner;
/**
 *
 * @author FATEC ZONA LESTE
 */
public class NewClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("digite as notas do bimestre(0-10) para saber"
                + " se você paasou de anos,ficou de recuperação ou está reprovado.");
        System.out.println("levando em consideração que: ");
        System.out.println("com média de 0-5: reprovado");
        System.out.println("média de 5-6 recuperação.");
        System.out.println("6-10 aprovado.");
        
        System.out.println("digite a nota do primeiro bimestre:");
        double b1 = scanner.nextDouble();
        System.out.println("digite a nota do segundo bimestre:");
        double b2 = scanner.nextDouble();
        System.out.println("digite a nota do terceiro bimestre:");
        double b3 = scanner.nextDouble();
        System.out.println("digite a nota do quarto bimestre:");
        double b4 = scanner.nextDouble();
        
        double media = (b1+b2+b3+b4)/4;
        System.out.println("sua media é:"+media);
        
        if (media>=6&&media<=10){
        System.out.println("Parabéns, você foi aprovado!");
    }else{
            System.out.println("você não foi aprovado. ");
                
            }
        if (!(media>2)) {
            System.out.println("você precisa melhorar.");
            
            
          
        }
        if (media>=5&&media<6){
                       System.out.println("você ficou de recuperção.");
        }
        if (b1>=10||b2>=10||b3>=10||b4>=10) {
            System.out.println("você tirou um 10, parabéns.");
        }
                
    }               
    
    }

