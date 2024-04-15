package atividade3;

public class Ex13 {
    public static void main(String[] args) {
        double hab1 = 80000;
        double hab2 = 200000;
        int i = 0;
        do {
            hab1 = hab1 + (hab1*0.03);
            hab2 = hab2 + (hab2*0.015);
            i++;
        } while (hab2 > hab1);
        System.out.println("demorará " + i + " anos");
    }
}
