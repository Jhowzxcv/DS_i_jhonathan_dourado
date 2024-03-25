
import java.util.Scanner;


public class Ex6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("digite o numero de eleitores: ");
        float tt = scanner.nextInt();
        
        System.out.println("digite o numero de votos brancos: ");
        float brn = scanner.nextInt();
        
        System.out.println("digite o numero de votos nulos: ");
        float nulo = scanner.nextInt();

        System.out.println("digite o numero de votos validos: ");
        float valid = scanner.nextInt();
        
        System.out.println("brancos: "+brn/tt*100+"%");
        System.out.println("nulos: "+nulo/tt*100+"%");
        System.out.println("validos: "+valid/tt*100+"%" );

        scanner.close();

    
    }
}
