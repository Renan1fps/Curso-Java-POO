package br.com.abc.Java.stringTeste.teste;

public class Teste {
    public static void main(String[] args) {
        String nome = "William";
        nome = nome.concat(" Suane"); // nome += " Suane";
        String nome2 = "William";
        String nome3 = new String("Catarina"); //1 variavel de referencia, 2 - um objeto do tipo string, 3 - Uma string no pool de String

        String teste = " Goku";
        String teste2 = "     0123456789       ";
        System.out.println(teste.charAt(3));//pega o caractere no indice 3
        System.out.println(teste.equalsIgnoreCase(teste2));//ignora a letra maiuscula
        System.out.println(teste.length());//devolve o tamanho
        System.out.println(teste2.replace('a', 'o'));//troca o caractere a por o
        System.out.println(teste.toLowerCase());//deixa tudo minusculo
        System.out.println(teste.toUpperCase()); //deixa tudo maisculo
        System.out.println(teste2.substring(0, 5));//pega do numero 0 ao 5
        System.out.println(teste2.trim());//ignora o espaço
        System.out.println(teste.trim());//ignora o espaço


    }

}
