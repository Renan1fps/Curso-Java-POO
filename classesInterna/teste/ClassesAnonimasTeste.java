package br.com.abc.Java.classesInterna.teste;

class Animal {
    public void fazAlgo() {
        System.out.println ( "Andando" );
    }
}

public class ClassesAnonimasTeste {
    public static void main(String[] args) {
        Animal ani = new Animal () {
            public void fazAlgo() {
                System.out.println ( "Andando mais rápido" );
            }
            public void comer(){//nao posso criar outro metodo pois ela nao tem referencia para animal;
                System.out.println ("comendo");//entao esse metodo é errado;
            }

        };
        ani.fazAlgo ();



    }
}
