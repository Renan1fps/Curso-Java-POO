package br.com.abc.Java.Datas.teste;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DataECalendar {
    public static void main(String[] args) throws ParseException {
        Scanner sc= new Scanner ( System.in );
      SimpleDateFormat sdf= new SimpleDateFormat ("dd/MM/yyyy");



      Calendar c= Calendar.getInstance ();
//        DateFormat df1= DateFormat.getDateInstance ();
//        DateFormat df2= DateFormat.getDateInstance ();
//       df1= DateFormat.getDateInstance (DateFormat.LONG);
//       System.out.println (df1.format ( c.getTime () ));
//        df2= DateFormat.getDateInstance (DateFormat.MEDIUM);
//        System.out.println (df2.format ( c.getTime () ));
        System.out.println (sdf.format ( new Date () ));


    }
}
