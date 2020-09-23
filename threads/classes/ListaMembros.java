package br.com.abc.Java.threads.classes;

import java.util.LinkedList;
import java.util.Queue;

public class ListaMembros {
    private final Queue < String > emails = new LinkedList <> ();//lista onde os email ficaram
    private boolean aberta = true;//para saber se está podendo receber email;

    public int getEmailsPendentes() {//para saber se minha lista email tem algum email;
        synchronized (emails) {
            return this.emails.size ();
        }
    }

    public boolean isAberta() {
        return aberta;
    }

    public String obterEmailDaLista() {//para obter email;
        String email = null;
        try {
            synchronized (this.emails) {
                while (this.emails.size () == 0) {
                    if (!aberta) return null;
                    System.out.println ( "Lista vazia, colocando  a thread" + Thread.currentThread ().getName () + "em espera!" );
                    this.emails.wait ();//a thread que estiver executando esse metodo vai ficar em espera por causa do wait e lembrar de sincronizar;
                }
                this.emails.poll ();//a collection queue vai remover o primeiro e me retornar;
            }

        } catch (InterruptedException e) {
            e.printStackTrace ();
        }
        return email;
    }

    public void adicionandoEmailLista(String emailInformado){//adiconar oq foi passado na lista para que o metodo anterior possa executar
        synchronized (this.emails){
            this.emails.add ( emailInformado );
            System.out.println ("Email adicionado a lista");
            System.out.println ();
            System.out.println ("Notificando a thread");
            this.emails.notifyAll ();
        }
    }
    public void fechandoLista(){
        System.out.println ("notificando as threads que nao tem mais email!");
        aberta= false;
        synchronized (this.emails){
            this.emails.notifyAll ();
        }
    }
}
