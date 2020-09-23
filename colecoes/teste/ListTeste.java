package br.com.abc.Java.colecoes.teste;

import br.com.abc.Java.colecoes.classes.Celular;

import java.util.ArrayList;
import java.util.List;

public class ListTeste {//permite repetiçoes
    public static void main(String[] args) {
        Celular celular1 = new Celular ( "redmi note 8" , "452312" );
        Celular celular2 = new Celular ( "redmi note 9" , "462313" );
        Celular celular3 = new Celular ( "redmi note 10" , "475614" );
        Celular celular4 = new Celular ( "redmi note 10" , "475614" );
        List < Celular > celularList = new ArrayList <> ();//criando uma lista de celulares;
        celularList.add ( celular1 );//adicionando os objetos celulares na lista;
        celularList.add ( celular2 );
        celularList.add ( celular3 );
        celularList.add ( celular4 );
        for (Celular cell : celularList) {
            System.out.println ( cell );


        }   System.out.println ( celularList.size () );

//        System.out.println ( "-------------------------" );
//        celularList.remove ( 0 );//removendo da lista na posiçao 0;
//        Celular celular4= new Celular ("Samsung a20", "214563");
//        System.out.println ( celularList.contains ( celular4 ));//para saber se tenho esse objeto dentro da lista;
//        System.out.println ( celularList.size () );//imprimindo o tamanho da lista
//        celularList.clear ();//para limpar minha lista;
//        for (Celular cell : celularList) {
//            System.out.println ( cell.getNome () );//imprimindo só o nome
    }


}

