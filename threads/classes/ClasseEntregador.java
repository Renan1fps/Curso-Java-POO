package br.com.abc.Java.threads.classes;

public class ClasseEntregador implements Runnable {
    private ListaMembros listaMembros;

    public ClasseEntregador(ListaMembros listaMembros) {
        this.listaMembros = listaMembros;
    }

    @Override
    public void run() {
        String nomeThread = Thread.currentThread ().getName ();
        System.out.println ( nomeThread + "Começando o trabalho de entrega" );
        int emPendentes = listaMembros.getEmailsPendentes ();
        boolean aberta = listaMembros.isAberta ();
        while (aberta || emPendentes > 0) {// o aberta serve para que ele fique esperando memso que nao tenha emails;
            try {
                String email = listaMembros.obterEmailDaLista ();
                if (email != null) {
                    System.out.println ( "enviando email para: " + email );
                    Thread.sleep ( 2000 );
                    System.out.println ( "email eviado" );
                }

            } catch (InterruptedException e) {
                e.printStackTrace ();
            }
            aberta = listaMembros.isAberta ();
            emPendentes= listaMembros.getEmailsPendentes ();
        }
    }
}
