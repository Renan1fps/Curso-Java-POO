package br.com.abc.Java.colecoes.teste;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTeste {
    public static void main(String[] args) {

        Queue < String > queue = new PriorityQueue <> ();//aceita repetiçoes e é que nem a Tree
        queue.add ( "c" );
        queue.add ( "d" );
        queue.add ( "a" );
        queue.add ( "b" );

        System.out.println ( queue );
    }
}
