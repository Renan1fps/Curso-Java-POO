package br.com.abc.Java.expressoesregulares;

import java.util.Scanner;

public class ScannerTeste {
    public static void main(String[] args) {
        Scanner sc = new Scanner ( "1 2 3 4 5 6" );
        while (sc.hasNext ()) {
            System.out.println ( sc.next () );
        }
        System.out.println ( "-------------------------" );
        Scanner sc2 = new Scanner ( "1 true 100 oi" );
        while (sc2.hasNext ()) {
            if (sc2.hasNextInt ()) {
                int valor = sc2.nextInt ();
                System.out.println ( "int " + valor );

            }else if(sc2.hasNextBoolean ()){
                boolean b= sc2.nextBoolean ();
                System.out.println (b);
            }else {
                System.out.println (sc2.next ());
            }
        }
    }
}
