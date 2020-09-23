package br.com.abc.Java.Datas.teste;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Scanner;


public class DateFormatTeste {
    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in );
        Calendar c = Calendar.getInstance ();
        ;
        c.set ( 2020 , 07 , 13 );
        DateFormat df = DateFormat.getDateInstance (DateFormat.LONG);
        System.out.println ( df.format ( c.getTime () ) );

    }
}
