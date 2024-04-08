package atividades1; 

import java.util.Scanner;


public class Ex7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("digite o salario atual: ");
        float slr = scanner.nextInt();
        
        System.out.println("digite a porcentagem de reajuste: ");
        float prc = scanner.nextInt()/100;
        
        System.out.println("o salario reajustado é: "+slr*prc+slr);
        scanner.close();

    
    }
}
