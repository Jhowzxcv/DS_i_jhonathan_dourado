package atividade2;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro valor:");
        float valor1 = scanner.nextFloat();

        System.out.println("Digite o segundo valor:");
        float valor2 = scanner.nextFloat();

        System.out.println("escolha o que vc quer fazer com o numero:");
        System.out.println("1-média; 2-diferença do 1° pelo 2°; 3-produto; 4-divisao do 1° pelo 2°:");
        int operacao = scanner.nextInt();

        double result = 0;

        switch (operacao) {
            case 1:
            result = (valor1+valor2)/2;
            break;

            case 2:
            result = valor1 - valor2;
            break;

            case 3:
            result = valor1*valor2;
            break;

            case 4:
            result = valor1/valor2;
            break;

        }

        System.out.println("resultado" + result);

        scanner.close();
    }
}
