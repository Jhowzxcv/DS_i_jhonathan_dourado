package atividade4;
import java.util.Random;

public class Projetocarro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // instanciar a Classe Carro
        Carro car = new Carro();
        car.nome = "Corolla";
        car.marca = "Toyota";
        car.ano = 2018;
        car.vel = 60;
        car.sensor = false;
         
        Random random = new Random();
        int numeroAleatorio = random.nextInt(100) + 1;

        // Verificando se o número gerado é par
        if (numeroAleatorio % 2 == 0) {
            car.sensor = true;
        } else {
            car.sensor = false;
        }
        
        }
    }

