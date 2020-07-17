package br.com.abc.Java.modificadorestatico.teste;

import br.com.abc.Java.modificadorestatico.classes.Carro;

import java.util.Scanner;

public class CarroTeste {
    public static void main(String[] args) {

        Carro car = new Carro("Bmw", 210);
        Carro car2 = new Carro("Audi", 250);
        Carro car3 = new Carro("Mercedes", 280);

        car.imprime();
        car2.imprime();
        car3.imprime();
        System.out.println("-------------------------------");
        Carro.setVelocidadeLimite(80);
        car.imprime();
        car2.imprime();
        car3.imprime();


    }
}