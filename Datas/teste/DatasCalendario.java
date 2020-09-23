package br.com.abc.Java.Datas.teste;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatasCalendario {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
       // if (Calendar.SUNDAY == c.getFirstDayOfWeek()) {
        //    System.out.println("domingo é o primeiro dia da semana");
       // }
       // System.out.println(c.get(Calendar.DAY_OF_MONTH));
       // System.out.println(c.get(Calendar.DAY_OF_WEEK));
       // System.out.println(c.get(Calendar.DAY_OF_YEAR));
       // Date date = c.getTime();
        //System.out.println (c.get (Calendar.SATURDAY));
        Date date= c.getTime ();
        System.out.println (date);

        }



    }
