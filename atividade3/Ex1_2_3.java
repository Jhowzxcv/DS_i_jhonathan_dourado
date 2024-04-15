package atividade3;
import java.util.Scanner;

public class Ex1_2_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        int num1 = scanner.nextInt();
        int num2;

        do {
            System.out.println("Digite o segundo número, diferente de zero:");
            num2 = scanner.nextInt();
            if (num2 == 0) {
                System.out.println("O segundo número não pode ser zero. Por favor, digite novamente.");
            }
        } while (num2 == 0);

        System.out.println("A divisão dos valores resulta em: " + (float)num1/num2);
        scanner.close();
    }
}
