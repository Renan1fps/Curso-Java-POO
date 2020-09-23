package br.com.abc.Java.expressoesregulares;

public class TokensEdelimitadores {
    public static void main(String[] args) {//usando a classe string para pegar valores individualmente
        String str= "12345";
       String[] tokens= str.split ( "" );//aqui eu passo o delimitador (oq separa) que pode ser , . \d \W...
        for (String stt: tokens) {
            System.out.println (stt);

        }
    }
}

