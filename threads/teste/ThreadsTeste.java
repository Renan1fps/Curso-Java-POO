package br.com.abc.Java.threads.teste;

class ThreadsExemplo extends Thread{
    private char c;

    public ThreadsExemplo(char c) {
        this.c = c;
    }
    public  void run(){
        System.out.println (" exexcutando "+Thread.currentThread ().getName ());
        for (int i = 0; i <1000 ; i++) {
            System.out.print (c);
            if (i % 100==0){
                System.out.println ();
            }
            try {
                Thread.sleep ( 2000 );
            } catch (InterruptedException e) {
                e.printStackTrace ();
            }

        }
    }
}

public class ThreadsTeste {
    public static void main(String[] args) {
        System.out.println ("executando main"+Thread.currentThread ().getName ());
        ThreadsExemplo t1= new ThreadsExemplo ( 'a' );
        ThreadsExemplo t2= new ThreadsExemplo ( 'b' );
        ThreadsExemplo t3= new ThreadsExemplo ( 'c' );
        ThreadsExemplo t4= new ThreadsExemplo ( 'd' );
        ThreadsExemplo t5= new ThreadsExemplo ( 'e' );
        t1.start ();
        t2.start ();
        t3.start ();
        t4.start ();
        t5.start ();
        t4.setPriority ( Thread.MAX_PRIORITY );//aqui eu defino que essa thread tera prioridade sobre as outras mas nao é garantido

    }
}
