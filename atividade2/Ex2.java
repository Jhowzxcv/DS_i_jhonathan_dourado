package atividade2;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a primeira nota:");
        float nota1 = scanner.nextFloat();

        System.out.println("Digite a segunda nota:");
        float nota2 = scanner.nextFloat();

        double med = (nota1 + nota2) / 2;

        med = Math.ceil(med);

        int intmed = (int) med;

        String msg = "";

        switch (intmed) {
            case 1:
            case 2:
            case 3:
            case 4:
                msg = "Reprovado";
                break;
            case 5:
            case 6:
            case 7:
                msg = "Exame";
                break;
            case 8:
            case 9:
            case 10:
                msg = "Aprovado";
                break;
            default:
                msg = "Nota inválida";
        }

        System.out.println("A classificação do aluno é: " + msg);

        scanner.close();
    }
}
