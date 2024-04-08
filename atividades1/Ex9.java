package atividades1; 
import java.util.Scanner;


public class Ex9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("digite seu salario: ");
        float slr = scanner.nextInt();
        
        System.out.println("numero de carros vendidos: ");
        int vend = scanner.nextInt();

        System.out.println("valor recebido por carro vendido: ");
        float cms = scanner.nextInt();

        System.out.println("valor total das vendas: ");
        float qnt = scanner.nextInt();

        float tt = slr + vend * cms + qnt;

        System.out.println("salario final: "+ tt * 0.05);

        scanner.close();
    }
}

