package atividade4;

public class Carro {
    //atributos
    String nome;
    String marca;
    int ano;
    int vel;
    boolean sensor;
    
    //métodos
    void acelerar(int aceleracao) {
        vel += aceleracao;
    }
    
    void freiar(int reduzir) {
        vel -= reduzir;
    }
    
    void buzinar() {
        System.out.println("BiBi Bibi");
    } 

    void ACC() {
        // Enquanto o sensor estiver ligado, freia o carro
        while (this.sensor == true) {
            freiar(5); // Supondo que o carro reduza 5 km/h quando o sensor está ligado
            System.out.print("a velocidade do carro é "+vel);      
        }
        
        // Enquanto o sensor estiver desligado, acelera o carro
        while (this.sensor == false) {
            acelerar(5); // Supondo que o carro aumente 5 km/h quando o sensor está desligado
            System.out.print("a velocidade do carro é "+vel);      
        }

    }                                        
}
