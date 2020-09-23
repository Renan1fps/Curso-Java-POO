package br.com.abc.Java.resourcebundles.teste;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTeste {
    public static void main(String[] args) {
        ResourceBundle rb = ResourceBundle.getBundle ( "messages" , new Locale ( "en" , "US" ) );
        System.out.println ( rb.getString ( "hello" ) );
        System.out.println ( rb.getString ( "good.morning" ) );
        rb = ResourceBundle.getBundle ( "messages" , new Locale ( "pt" , "BR" ) );
        System.out.println ( rb.getString ( "hello" ) );
        System.out.println ( rb.getString ( "good.morning" ) );
    }
}
