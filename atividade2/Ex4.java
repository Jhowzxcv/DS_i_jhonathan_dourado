package atividade2;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o código do produto:");
        int med = scanner.nextInt();

        System.out.println("Digite a quantidade do produto:");
        int qnt = scanner.nextInt();
        
        double valor = 0;
        
        switch(med) {
            case 100:
            valor = 1.70;
            break;
            case 101:
            valor = 2.3;
            break;
            case 102:
            valor = 2.6;
            break;
            case 103:
            valor = 2.4;
            break;
            case 104:
            valor = 2.5;
            break;
            case 105:
            valor = 1;
            break;
                
        }
        
        double valorF = valor*qnt;

        System.out.println("o valor final é: " + valorF);
        
        scanner.close();
    }
}
