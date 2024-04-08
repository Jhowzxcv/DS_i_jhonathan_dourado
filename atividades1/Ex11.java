package atividades1; 
import java.util.Scanner;

public class Ex11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("digite os litros: ");
        float ltr = scanner.nextFloat();
        
        // Consumir nova linha pendente
        scanner.nextLine();

        System.out.println("digite o tipo de combustível A-álcool, G-gasolina: ");
        String vend = scanner.nextLine();

        float desc;
        float tt;
        float ttf = 0; // Inicializar ttf para evitar possível erro de compilação

        if(vend.equals("A") && ltr <= 20 ){
            desc = 0.03f * ltr;
            tt = ltr * 2.90f;
            ttf = tt - desc;
        }
        else if(vend.equals("A") && ltr >= 20 ){
            desc = 0.05f * ltr;
            tt = ltr * 2.90f;
            ttf = tt - desc;
        }
        else if(vend.equals("G") && ltr <= 20 ){
            desc = 0.04f * ltr;
            tt = ltr * 3.30f ;
            ttf = tt - desc;
        }
        else if(vend.equals("G") && ltr >= 20 ){
            desc = 0.06f * ltr;
            tt = ltr * 3.30f;
            ttf = tt - desc;
        } else {
            // Definir um valor padrão para ttf caso a entrada do usuário seja inválida
            System.out.println("Tipo de combustível inválido.");
        }

        // Formatar o valor de ttf com duas casas decimais após a vírgula
        String ttfFormatado = String.format("%.2f", ttf);
        System.out.println("Valor a ser pago: " + ttfFormatado);

        scanner.close();
    }
}
