
import java.util.Scanner;


public class Ex8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Custo da fabrica: ");
        float fab = scanner.nextInt();
        
        float dist = 28;
        
        float impost = 45;

        float tt = fab + fab*dist/100 + fab*impost/100;

        System.out.println("custo final: "+ tt);

        scanner.close();

    }
}
