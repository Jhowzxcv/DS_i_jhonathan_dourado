package atividade3;
import java.util.Scanner;


public class Ex12 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num;
        do{
    System.out.println("Digite o numero:");
        num = scanner.nextInt();
        if(num >= 10 || num <= 0){
            System.out.println("O numero tem que estar entre 0 e 10, digite novamente ");
        }
    }while(num >= 10 || num <= 0);
    
    int i = 0;   
        do {
            System.out.println(num*i);
            i++;
        } while (i <= 10);
        scanner.close();
    }
    
    
}
