package br.com.abc.Java.threads.teste;

public class ContaTeste implements Runnable {
    private Conta conta = new Conta();

    public static void main(String[] args) {
        ContaTeste contaTeste= new ContaTeste ();
        Thread renan = new Thread (contaTeste, "Renan");
        Thread lucas = new Thread (contaTeste, "Lucas");
        lucas.start ();
        renan.start ();
    }


    public synchronized void saque(int valor){
        if (conta.getSaldo ()>=valor){
            System.out.println (Thread.currentThread ().getName ()+ " está indo sacar!");
            try {
                Thread.sleep ( 2000 );
            } catch (InterruptedException e) {
                e.printStackTrace ();
            }
            conta.saque ( valor );
            System.out.println (Thread.currentThread ().getName ()+ " sacou e o saldo ficou: " + conta.getSaldo ());
        }
        else{
            System.out.println (Thread.currentThread ().getName ()+ " não é possivel realizar o saque! Saldo abaixo do valor para ser sacado!");
        }
    }



    @Override
    public void run() {
        for (int i = 0; i <5 ; i++) {
            saque ( 10 );
            if (conta.getSaldo ()<0){
                System.out.println ("Deu merda!");
            }

        }

    }
}
