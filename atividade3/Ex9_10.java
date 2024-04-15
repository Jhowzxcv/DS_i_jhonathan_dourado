package atividade3;
import java.util.Scanner;


public class Ex9_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
do{
    System.out.println("Digite um número, diferente de zero:");
        num = scanner.nextInt();
        if(num == 0){
            System.out.println("numero invalido, digite novamente");
        }
} while (num == 0);
    int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= num);
    
        scanner.close();
    
    }





}