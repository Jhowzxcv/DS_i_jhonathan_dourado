import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) {

        float ideal;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("digite seu nome: ");
        String name = scanner.nextLine();
        
        System.out.println("digite sua altura em centimetros: ");
        float cm = scanner.nextFloat()/100;
        
        // Consumir nova linha pendente
        scanner.nextLine();

        System.out.println("indique seu sexo, M(masculino) ou F(feminino): ");
        String sex = scanner.nextLine();

        if(sex.equals("M")){
           ideal = (float) (72.7 * cm - 58);    
        } else {
           ideal = (float) (62.1 * cm - 44.7); 
        }

        String idealFormatado = String.format("%.2f", ideal);
        System.out.println(name + ", seu peso ideal é: "+ idealFormatado + "kg");

        scanner.close();
    }
}
