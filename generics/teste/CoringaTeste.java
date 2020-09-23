package br.com.abc.Java.generics.teste;


import java.util.ArrayList;
import java.util.List;

abstract class Animal {
    public abstract void imprime();


}

class Gato extends Animal {

    @Override
    public void imprime() {
        System.out.println ( "Gato é god" );

    }
}

class Cachorro extends Animal {
    @Override
    public void imprime() {
        System.out.println ( "Cahorro é chato" );

    }
}

public class CoringaTeste {
    public static void main(String[] args) {
        //criei arrays de animais e vou usar polimorfirmos para imprimir seus metodos;
        Gato[] gato1 = {new Gato () , new Gato ()};
        Cachorro[] cachorros = {new Cachorro () , new Cachorro ()};
        imprimesout ( cachorros );
        imprimesout ( gato1 );
        List<Gato>gatinhos= new ArrayList <> ();
        gatinhos.add ( new Gato () );
        List<Cachorro>cachorrinhos= new ArrayList <> ();
        cachorrinhos.add ( new Cachorro () );
        imprimesoutlist ( gatinhos );
        imprimesoutlist ( cachorrinhos );


    }

    public static void imprimesout(Animal[] animal) {//com arrays eu posso usar polimorfismos passando gato e cachorro no parametro;
        for (Animal ani : animal) {
            ani.imprime ();


        }
    }
    public static void imprimesoutlist(List<? extends Animal> animal) {//para colletions eu tenho que usar o coringa e usa extends da super Classe
        for (Animal ani : animal) {
            ani.imprime ();
        }
        //nesse metodo eu nao posso adicionar nada na minha lista;

    }
    public static void imprimelistsuper(List<? super Cachorro> cachorros){//nesse metodo posso add qualquer animal que seja cachorro ou super(animal e object)
        cachorros.add ( new Cachorro () );

    }
}





