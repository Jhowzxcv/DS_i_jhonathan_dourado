package atividade3;
import java.util.Scanner;

public class Ex4_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


    float nota1, nota2;
    String calc;
do{
    do {
       System.out.println("Digite a primeira nota:");
       nota1 = scanner.nextFloat();
    
       System.out.println("Digite a segunda nota:");
        nota2 = scanner.nextFloat();
    
       if (nota1 < 0 || nota1 > 10 || nota2 < 0 || nota2 > 10) {
           System.out.println("As notas devem estar entre 0 e 10. Por favor, digite novamente.");
      }
    } while (nota1 < 0 || nota1 > 10 || nota2 < 0 || nota2 > 10);
         double med = (nota1 + nota2)/2; 
         System.out.println("a média entre os numeros é "+ med);

        scanner.nextLine();

         System.out.println("Novo calculo? s/n");
         calc = scanner.nextLine();
         
} while (calc.equals("s")); 




        
        scanner.close();
    }
}
