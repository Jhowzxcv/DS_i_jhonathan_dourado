
import java.util.Scanner;


public class Ex11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("digite os litros: ");
        float ltr = scanner.nextInt();
        
        System.out.println("digite o tipo de combustível A-álcool, G-gasolina: ");
        String vend = scanner.nextInt();

        if(vend == A & ltr <= 20 ){
            float desc = 0.03*ltr;
            float tt = ltr*2.90-desc*2.90;
        }
        else if(vend == A & ltr >= 20 ){
            float desc = 0.05*ltr;
            float tt = ltr*2.90-desc*2.90;
        }
        else if(vend == G & ltr <= 20 ){
            float desc = 0.04*ltr;
            float tt = ltr*3.30-desc*3.30;
        }
        else if(vend == G & ltr >= 20 ){
            float desc = 0.06*ltr;
            float tt = ltr*3.30-desc*3.30;
        }

        System.out.println("Valor a ser pago: "+ tt);

    }
}

