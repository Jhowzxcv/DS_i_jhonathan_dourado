/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex5;
import java.util.Scanner;

/**
 *
 * @author CAMARGO
 */
public class Ex5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("digite sua idade: ");
        int ano = scanner.nextInt();
        
        System.out.println("E quantos meses?");
        int meses = scanner.nextInt();
        
        System.out.println("E dias?");
        int dias = scanner.nextInt();
        
        ano = ano*365;
        
        meses = meses*30;
        
        int tt = ano+meses+dias;
        
        System.out.println("você ja tem " + tt + " dias de vida");
        
            
        
        
        
        
        
        


        scanner.close();
    }
    
}
