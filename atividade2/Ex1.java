package atividade2;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o código do produto:");
        int med = scanner.nextInt();
        
        String msg = "";
        
        switch(med) {
            case 1:
                msg = "Alimento não-perecível";
                if (med >= 2 && med <= 4) {
                msg = "Alimento perecível";
                }
            case 5:
            case 6:
                msg = "Vestuário";
            case 7:
                msg = "Higiene Pessoal";
            if (med >= 8 && med <= 15){
                msg = "Limpeza e Utensílios Domésticos";
                }
            default:
                msg = "Código inválido";
                
        }
        
        System.out.println("A classificação do produto é: " + msg);
        
        scanner.close();
    }
}
