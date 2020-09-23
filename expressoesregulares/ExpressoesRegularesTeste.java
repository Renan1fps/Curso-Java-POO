package br.com.abc.Java.expressoesregulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressoesRegularesTeste {
    public static void main(String[] args) {
        // \d minusculo para pegar todos os numeros;
        // \D maiusculo pega todos que nao sao digito;
        // \s procura por espaços em branco (\t \r \f \r) <--- sao consirados espaço branco
        // \S maisculo pega o que nao é espaço em branco
        // \w minusculo pega tudo de a-z A-Z  numeros e o _
        // \W maisculo pega tudo que nao for letras e numeros e o _
        // [] pega o que voce colocar dentro dos cochetes EX: [abc] irá pegar só essas letras minusculas
        // [a-cA-C] do a ao c maisculo e minuscolo, para numeros o mesmo serve
        // numero exadecimal começa com com zero e x EX: 0x100  0x56
        // ? zero ou uma vez
        // * zero ou mais
        // + uma ou mais
        // () serve para agrupamento EX: o(v|c)o = ovo, oco  maca(rr|c)ã = macarrao, macacao
        // | serve para 'ou'
        // $ para pegar algo em final de linha
        // . coringa ele pode ser qualquer coisa
        // ^ negaçao EX: ^abc tudo que tiver abc ele nao ira pegar


//      String regex = "0[xX]([0-9a-fA-F])+(\\s|$)"; //o padrao que quero
//      String texto = "12 0x 0x 0xFFABC 0x10G 0x1";//texto que é para ser procurado

//      String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
//      String texto = "renan.sergipe@gmail.com, fulano_68@gmail.com, willian@gmail.com.br";

//      String regex = "\\d{2}/\\d{2}/\\d\\d\\d\\d";//trabalhando com datas
//      String texto = "20/03/2020   4/05/2020  13/05/2020   14/8/20";

        String regex = "proj([^,])*";
        String texto = " curso.java, aula, serviço.java, proj.java, aula.java, proj1.java ";

        Pattern pattern = Pattern.compile ( regex );//passo o padrao que quero
        Matcher matcher = pattern.matcher ( texto );//passo o texto que é para procurar
        System.out.println ( "fulano_68@gmail.com".matches ( regex ) );//validar
        System.out.println ( "texto: " + texto );
        System.out.println ( "indice: 0123456789" );
        System.out.println ( "expressao:" + matcher.pattern () );
        while (matcher.find ()) {//finde para procurar
            System.out.println ( matcher.start () + " " + matcher.group ());
        }
    }
}
